/*
 *
 *   Created by VnjVibhash on 3/10/24, 5:32 PM
 *   Copyright Ⓒ 2024. All rights reserved Ⓒ 2024 http://vivekajee.in/
 *   Last modified: 3/10/24, 5:32 PM
 *
 *   Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 *   except in compliance with the License. You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENS... Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *    either express or implied. See the License for the specific language governing permissions and
 *    limitations under the License.
 * /
 */

package in.innovateria.planeshooterGame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

/**
 * Created by Recording on 9/11/2017.
 */

public class Plane {
    Bitmap[] plane = new Bitmap[15];
    int planeX, planeY, velocity, planeFrame;
    Random random;

    public Plane(Context context) {
        plane[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_1);
        plane[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_2);
        plane[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_3);
        plane[3] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_4);
        plane[4] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_5);
        plane[5] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_6);
        plane[6] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_7);
        plane[7] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_8);
        plane[8] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_9);
        plane[9] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_10);
        plane[10] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_11);
        plane[11] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_12);
        plane[12] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_13);
        plane[13] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_14);
        plane[14] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane_15);
        random = new Random();
        resetPosition();
    }

    public Bitmap getBitmap() {
        return plane[planeFrame];
    }

    public int getWidth() {
        return plane[0].getWidth();
    }

    public int getHeight() {
        return plane[0].getHeight();
    }

    public void resetPosition() {
        planeX = GameView.dWidth + random.nextInt(1200);
        planeY = random.nextInt(300);
        velocity = 8 + random.nextInt(13);
        planeFrame = 0;
    }
}
