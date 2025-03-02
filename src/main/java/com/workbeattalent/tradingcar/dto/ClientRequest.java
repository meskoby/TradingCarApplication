package com.workbeattalent.tradingcar.dto;

import com.workbeattalent.tradingcar.enums.Gender;

public record ClientRequest(
        String firstname,
        String lastname,
        String email,
        Gender gender
) {
}
