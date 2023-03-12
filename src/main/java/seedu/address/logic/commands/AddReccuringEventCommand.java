package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.event.RecurringEvent;
import seedu.address.model.person.Person;

/**
 * Command class for AddRecurringEventCommand.
 */
public class AddReccuringEventCommand extends Command {

    public static final String COMMAND_WORD = "event_create";
    public static final String MESSAGE_SUCCESS = "New isolated event added: %1$s";
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Add a recurring event into the recurring event list"
            + "by the index number used in the last person listing. "
            + "Existing remark will be overwritten by the input.\n"
            + "Parameters: event name, week of the day, start time and end time (must be in the format HH:mm) "
            + "e/[EVENT_NAME] d/[DAY_OF_WEEK] f/[START_TIME] t/[END_TIME] \n"
            + "Example: " + COMMAND_WORD + "1" + " re/biking" + "d/Monday" + " f/14:00" + " t/15:00";


    public final RecurringEvent eventToAdd;
    public final Index index;


    /**
     * Constructor for AddRecurringEventCommand
     * @param eventToAdd
     * @param index
     */
    public AddReccuringEventCommand(Index index, RecurringEvent eventToAdd) {
        this.eventToAdd = eventToAdd;
        this.index = index;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Person> lastShownList = model.getFilteredPersonList();

        if (index.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_PERSON_DISPLAYED_INDEX);
        }

        Person personToEdit = lastShownList.get(index.getZeroBased());
        model.addRecurringEvent(personToEdit, eventToAdd);

        return new CommandResult(String.format(MESSAGE_SUCCESS, eventToAdd) + " to "
                + personToEdit.getName());

    }
}
