import java.awt.Color;
import java.util.Collections;
import java.util.Arrays;

public class RandomColorStrategy extends ColorStrategy {
    private Color[] stdColors = {Color.BLACK,
                Color.BLUE,
                Color.CYAN,
                Color.DARK_GRAY,
                Color.GRAY,
                Color.GREEN,
                Color.LIGHT_GRAY,
                Color.MAGENTA,
                Color.ORANGE,
                Color.PINK,
                Color.RED,
                Color.YELLOW};

        public RandomColorStrategy() {
            Collections.shuffle(Arrays.asList(stdColors));

            for(int i = 0; i < colors.length; i++)
                colors[i] = stdColors[i];
        }
}


