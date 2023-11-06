package lotto.util.io.output.viewer;

import java.util.List;

public interface Viewer {
    public void ViewPrint();

    void ViewPrint(String data);

    void ViewPrint(List<Integer> data);
}
