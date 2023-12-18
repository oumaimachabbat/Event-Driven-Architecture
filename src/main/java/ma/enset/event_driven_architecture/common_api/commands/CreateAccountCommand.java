package ma.enset.event_driven_architecture.common_api.commands;

import lombok.Getter;

public class CreateAccountCommand extends BaseCommand<String>{
    @Getter private double initialBalance;
    @Getter private String currency;
    public CreateAccountCommand(String id, double initialBalance, String currency) {
        super(id);
        this.initialBalance = initialBalance;
        this.currency = currency;
    }
}