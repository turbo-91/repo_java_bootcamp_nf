package org.example._060125_burgermenu.model;

import java.math.BigDecimal;

public record MenuDTO(String name, BigDecimal price, String mainDish, String sideDish, String beverage) {
}
