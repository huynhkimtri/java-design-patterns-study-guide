package patterns.creational.factory_method.factory;

import patterns.creational.factory_method.buttons.Button;
import patterns.creational.factory_method.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
