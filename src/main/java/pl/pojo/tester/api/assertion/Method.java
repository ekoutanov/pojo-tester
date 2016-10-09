package pl.pojo.tester.api.assertion;

import lombok.Getter;
import pl.pojo.tester.api.*;

/**
 * Declares methods that can be tested using POJO-TESTER.
 * <p>
 * For more documentation, please refer <a href="http://pojo.pl">POJO-TESTER User Guide documentation</a>
 *
 * @author Piotr Joński
 * @since 0.1.0
 */
@Getter
public enum Method {
    EQUALS(new EqualsTester()),
    HASH_CODE(new HashCodeTester()),
    SETTER(new SetterTester()),
    GETTER(new GetterTester()),
    TO_STRING(new ToStringTester()),
    CONSTRUCTOR(new ConstructorTester());

    private final AbstractTester tester;

    Method(final AbstractTester tester) {
        this.tester = tester;
    }
}
