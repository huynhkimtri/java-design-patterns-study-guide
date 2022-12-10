package patterns.creational.factory_method.factory;

import patterns.creational.factory_method.buttons.Button;
import patterns.creational.factory_method.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
