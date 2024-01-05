package com.example.foodtruck.Service;

import com.example.foodtruck.Api.ApiException;
import com.example.foodtruck.DTO.OrderDTO;
import com.example.foodtruck.Model.Order;
import com.example.foodtruck.Model.User;
import com.example.foodtruck.Repository.OrderRepository;
import com.example.foodtruck.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
    public void addOrder(OrderDTO orderDTO){
        User user=userRepository.findUserById(orderDTO.getUser_id());
        if (user == null) {
            throw new ApiException("the id user not found");
        }
        Order order=new Order(null,orderDTO.getDate(),orderDTO.getNumberOfDay(),orderDTO.getTotalPrice(),orderDTO.getOrderStatus(),orderDTO.getNote(),orderDTO.getDiscount(),user,null);
        orderRepository.save(order);
    }
    public void updateOrder(Integer auth ,OrderDTO orderDTO) {
//        User user=userRepository.findUserById(auth);
        Order orders=orderRepository.findOrderById(auth);
        if (orders == null) {
            throw new ApiException("the id user not found");
        }
        orders.setDate(orderDTO.getDate());
        orders.setNumberOfDay(orderDTO.getNumberOfDay());
        orders.setTotalPrice(orderDTO.getTotalPrice());
        orders.setOrderStatus(orderDTO.getOrderStatus());
        orders.setNote(orderDTO.getNote());
        orders.setDiscount(orderDTO.getDiscount());
        orderRepository.save(orders);
//        if (orderDTO.getUser_id()==auth) {
//            Order order = new Order(null, orderDTO.getDate(), orderDTO.getNumberOfDay(), orderDTO.getTotalPrice(), orderDTO.getOrderStatus(), orderDTO.getNote(), orderDTO.getDiscount(), user, null);
//            orderRepository.save(order);
//        }else throw new ApiException("the user id not same");
    }


    public void deleteOrder(Integer auth){
        Order order = orderRepository.findOrderById(auth);
        if (order == null) {
            throw new ApiException("the id nt found");
        }
        orderRepository.delete(order);
    }
}
