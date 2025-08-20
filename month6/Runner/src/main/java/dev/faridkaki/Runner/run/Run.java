package dev.faridkaki.Runner.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
    Integer id,
    @NotEmpty
    String title, 
    LocalDateTime startedOn,
    LocalDateTime complitedAt,
    @Positive
    Integer miles,
    Location location
)
{
    public Run
    {
        if (!complitedAt.isAfter(startedOn))
        {
            throw new IllegalArgumentException("Completed at must be after started on");
        }
    }
}
