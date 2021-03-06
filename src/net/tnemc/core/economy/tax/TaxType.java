package net.tnemc.core.economy.tax;

import java.math.BigDecimal;

public interface TaxType {

  String name();

  BigDecimal handleTaxation(BigDecimal amount, BigDecimal tax);
}