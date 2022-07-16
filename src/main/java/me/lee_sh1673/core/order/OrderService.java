package me.lee_sh1673.core.order;

public interface OrderService {

	Order createOrder(Long memberId, String itemName, int itemPrice);

}
