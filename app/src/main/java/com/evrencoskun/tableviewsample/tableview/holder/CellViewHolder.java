/*
 * Copyright (c) 2018. Evren Coşkun
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.evrencoskun.tableviewsample.tableview.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder;
import com.evrencoskun.tableviewsample.R;

/**
 * Created by evrencoskun on 23/10/2017.
 */

public class CellViewHolder extends AbstractViewHolder {

    public final TextView cell_textview;
    public final LinearLayout cell_container;
    public final ImageView cell_image;

    public CellViewHolder(View itemView) {
        super(itemView);
        cell_textview = (TextView) itemView.findViewById(R.id.cell_data);
        cell_container = (LinearLayout) itemView.findViewById(R.id.cell_container);
        cell_image = (ImageView) itemView.findViewById(R.id.cell_image);
    }
}