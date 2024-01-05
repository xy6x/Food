package com.example.foodtruck.Service;

import com.example.foodtruck.DTO.EvaluationDTO;
import com.example.foodtruck.Model.Evaluation;
import com.example.foodtruck.Model.FoodTruck;
import com.example.foodtruck.Model.User;
import com.example.foodtruck.Repository.EvaluationRepository;
import com.example.foodtruck.Repository.FoodTruckRepository;
import com.example.foodtruck.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EvaluationService {
    private final EvaluationRepository evaluationRepository;
    private final FoodTruckRepository foodTruckRepository;
    private final UserRepository userRepository;

    public List<Evaluation>  getAllEvaluation(){
        return evaluationRepository.findAll();
    }
    public void addEvaluation(EvaluationDTO evaluationDTO){
        FoodTruck foodTruck=foodTruckRepository.findFoodTruckById(evaluationDTO.getFood_truck_id());
        User user=userRepository.findUserById(evaluationDTO.getTicket_order_id());
    }
}
