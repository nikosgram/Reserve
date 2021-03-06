package net.tnemc.core.economy.currency;

import java.math.BigDecimal;
import java.util.TreeMap;

/**
 * Created by creatorfromhell on 8/9/2017.
 * All rights reserved.
 **/
public interface Currency {

  /**
   * @return The name of this currency in singular form.
   */
  String name();

  /**
   * @return The plural name of this currency.
   */
  String plural();

  /**
   * @return The symbol of this currency.
   */
  String symbol();

  /**
   * @return The number of decimal places this currency allows.
   */
  int decimalPlaces();

  /**
   * @return Whether or not this currency is the default.
   */
  boolean isDefault();

  /**
   * @return The default balance for this currency.
   */
  BigDecimal defaultBalance();

  /**
   * @return A TreeMap sorted by weight of the various major tiers that belong to this currency.
   */
  TreeMap<Integer, Tier> getMajorTiers();

  /**
   * @return A TreeMap sorted by weight of the various minor tiers that belong to this currency.
   */
  TreeMap<Integer, Tier> getMinorTiers();
}