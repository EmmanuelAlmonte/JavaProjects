
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.pluralsight.repository.HibernateSpeakerRespositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({ "com.pluralsight" })
public class appConfig {

  /*
   * // Singleton instance of SpeakerService
   * // Below wer're injecting speakerRepository bean into speaker service bean.
   * Then
   * // we return speakerService instance (Bean) to application when we call it.
   * 
   * @Bean(name = "speakerService")
   * 
   * @Scope(value = BeanDefinition.SCOPE_SINGLETON)
   * public SpeakerService getSpeakerService() {
   * // SpeakerServiceImpl service = new
   * SpeakerServiceImpl(getSpeakerRepository());
   * SpeakerServiceImpl service = new SpeakerServiceImpl();
   * // Setter injection
   * // service.setRepository(getSpeakerRepository());
   * return service;
   * }
   * 
   * // Singleton instance of speakerRepository meaning one will always be
   * created.
   * public SpeakerRepository getSpeakerRepository() {
   * return new HibernateSpeakerRespositoryImpl();
   * }
   */
}
