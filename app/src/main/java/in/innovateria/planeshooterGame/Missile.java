/*
 *
 *   Created by VnjVibhash on 3/10/24, 5:32 PM
 *   Copyright Ⓒ 2024. All rights reserved Ⓒ 2024 http://vivekajee.in/
 *   Last modified: 3/10/24, 4:43 PM
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
 * Created by Recording on 11/3/2017.
 */

public class Missile {
    int x, y;
    int mVelocity;
    Bitmap missile;

    public Missile(Context context, int initialX, int initialY) {
        missile = BitmapFactory.decodeResource(context.getResources(), R.drawable.missile);
        x = initialX - getMissileWidth() / 2;
        y = initialY - getMissileHeight() / 2;
        mVelocity = 50;
    }

    public int getMissileWidth() {
        return missile.getWidth();
    }

    public int getMissileHeight() {
        return missile.getHeight();
    }
}

