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

public class Explosion {

    Bitmap[] explosion = new Bitmap[9];
    int explosionFrame = 0;
    int explosionX, explosionY;

    public Explosion(Context context) {
        explosion[0] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion0);
        explosion[1] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion1);
        explosion[2] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion2);
        explosion[3] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion3);
        explosion[4] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion4);
        explosion[5] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion5);
        explosion[6] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion6);
        explosion[7] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion7);
        explosion[8] = BitmapFactory.decodeResource(context.getResources(), R.drawable.explosion8);
    }

    public Bitmap getExplosion(int explosionFrame) {
        return explosion[explosionFrame];
    }

    public int getExplosionWidth() {
        return explosion[0].getWidth();
    }

    public int getExplosionHeight() {
        return explosion[0].getHeight();
    }
}
