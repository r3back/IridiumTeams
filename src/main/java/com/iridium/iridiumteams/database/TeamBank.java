package com.iridium.iridiumteams.database;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@NoArgsConstructor
@DatabaseTable(tableName = "team_bank")
public class TeamBank extends TeamData {

    @DatabaseField(columnName = "id", generatedId = true, canBeNull = false, uniqueCombo = true)
    private int id;

    @DatabaseField(columnName = "bank_item", uniqueCombo = true)
    private String bankItem;

    @DatabaseField(columnName = "number")
    @Setter
    private double number;

    public TeamBank(@NotNull Team team, @NotNull String bankItem, double number) {
        super(team);
        this.bankItem = bankItem;
        this.number = number;
    }
}
