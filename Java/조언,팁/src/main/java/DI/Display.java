package DI;

import java.util.Objects;

public class Display {

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Display display = (Display) o;
        return Objects.equals(name, display.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Retina extends Display {

}


class NormalDevice extends Display{

}
