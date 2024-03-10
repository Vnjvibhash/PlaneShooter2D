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

/**
 * Created by Recording on 9/15/2017.
 */

public class Plane2 extends Plane {

    Bitmap[] plane = new Bitmap[10];

    public Plane2(Context context) {
        super(context);
        plane[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_1);
        plane[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_2);
        plane[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_3);
        plane[3] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_4);
        plane[4] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_5);
        plane[5] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_6);
        plane[6] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_7);
        plane[7] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_8);
        plane[8] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_9);
        plane[9] = BitmapFactory.decodeResource(context.getResources(), R.drawable.plane2_10);
        resetPosition();
    }

    @Override
    public Bitmap getBitmap() {
        return plane[planeFrame];
    }

    @Override
    public int getWidth() {
        return plane[0].getWidth();
    }

    @Override
    public int getHeight() {
        return plane[0].getHeight();
    }

    @Override
    public void resetPosition() {
        planeX = -(200 + random.nextInt(1500));
        planeY = random.nextInt(400);
        velocity = 5 + random.nextInt(21);
    }
}
