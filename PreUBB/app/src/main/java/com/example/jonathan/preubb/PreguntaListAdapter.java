package com.example.jonathan.preubb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class PreguntaListAdapter extends BaseAdapter{

    private Context mContext;
    private List<Pregunta> mPreguntaList;

    //Constructor


    public PreguntaListAdapter(Context mContext, List<Pregunta> mPreguntaList) {
        this.mContext = mContext;
        this.mPreguntaList = mPreguntaList;
    }

    @Override
    public int getCount() {
        return mPreguntaList.size();
    }

    @Override
    public Object getItem(int position) {
        return mPreguntaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.pregunta_list, null);
        TextView tvPregunta = (TextView)v.findViewById(R.id.IdPregunta);
        TextView tvEnunciado = (TextView)v.findViewById(R.id.Enunciado);
        TextView tvRespA = (TextView)v.findViewById(R.id.RespA);
        TextView tvRespB = (TextView)v.findViewById(R.id.RespB);
        TextView tvRespC = (TextView)v.findViewById(R.id.RespC);
        TextView tvRespD = (TextView)v.findViewById(R.id.RespD);

        //setear texto

        tvPregunta.setText(mPreguntaList.get(position).getIdPregunta());
        tvEnunciado.setText(mPreguntaList.get(position).getEnunciado());
        tvRespA.setText(mPreguntaList.get(position).getRespA());
        tvRespB.setText(mPreguntaList.get(position).getRespB());
        tvRespC.setText(mPreguntaList.get(position).getRespC());
        tvRespD.setText(mPreguntaList.get(position).getRespD());

        v.setTag(mPreguntaList.get(position).getIdPregunta());
        return v;
    }
}
