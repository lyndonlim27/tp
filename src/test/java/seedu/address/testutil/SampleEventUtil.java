package seedu.address.testutil;

import static seedu.address.logic.parser.CliSyntax.PREFIX_DAYOFWEEK;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ENDDATETIME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ISOEVENT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_RECURRINGEVENT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_STARTDATETIME;

/**
 * A utility class containing a list of {@code String } objects of user inputs for event_create to be used in tests.
 */
public class SampleEventUtil {
    public static final String BIKING_ISOLATED_EVENT = "1" + PREFIX_ISOEVENT + "biking" + PREFIX_STARTDATETIME
            + "09/03/2023 14:00" + PREFIX_ENDDATETIME + "09/03/2023 15:00";

    public static final String MISSING_INDEX_ISOLATED_EVENT = PREFIX_ISOEVENT + "biking" + PREFIX_STARTDATETIME
            + "09/03/2023 14:00" + PREFIX_ENDDATETIME + "09/03/2023 15:00";

    public static final String MISSING_EVENT_NAME_ISOLATED_EVENT = "1" + PREFIX_ISOEVENT + PREFIX_STARTDATETIME
            + "09/03/2023 14:00" + PREFIX_ENDDATETIME + "09/03/2023 15:00";

    public static final String INVALID_DATE_FORMAT_ISOLATED_EVENT = "1" + PREFIX_ISOEVENT + "biking"
            + PREFIX_STARTDATETIME + "09-03-2023 14:00" + PREFIX_ENDDATETIME + "09/03/2023 15:00";

    public static final String MISSING_INDEX_RECURRING_EVENT = PREFIX_RECURRINGEVENT + "biking" + PREFIX_DAYOFWEEK
            + "MONDAY" + PREFIX_STARTDATETIME + "18:00" + PREFIX_ENDDATETIME + "20:00";

    public static final String MISSING_DAY_RECURRING_EVENT = PREFIX_RECURRINGEVENT + "biking" + PREFIX_STARTDATETIME
            + "18:00" + PREFIX_ENDDATETIME + "20:00";
    public static final String INVALID_TIME_RECURRING_EVENT = PREFIX_RECURRINGEVENT + "biking" + PREFIX_DAYOFWEEK
            + "MONDAY" + PREFIX_STARTDATETIME + "18:00" + PREFIX_ENDDATETIME + "20";

}
