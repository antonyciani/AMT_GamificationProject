/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.gamification.api.dao;

import ch.heigvd.gamification.model.GameEvent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Antony
 */
public interface GameEventsRepositoryJPA extends JpaRepository<GameEvent, Long>{
    
}
