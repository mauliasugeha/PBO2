interface Applicable {
    String getPromoCode();
    boolean isCustomerEligible(Pelanggan customer);
    boolean isMinimumPriceEligible(Order order);
    boolean isShippingFeeEligible(Order order);
    double calculateTotalDiscount(Order order) throws Exception;

    double calculateTotalCashback(Order order) throws Exception;

    double calculateTotalShippingFeeDiscount(Order order) throws Exception;
}
