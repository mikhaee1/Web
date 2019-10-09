package com.example.mikhaee1SmallSocialNetwork.repos;

import com.example.mikhaee1SmallSocialNetwork.domain.Message;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

/**
 * @author mikhaee1
 */

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}