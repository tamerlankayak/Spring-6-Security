package azintelecom.az.securityspring6.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResources {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private static final List<Todo> TODOS_LIST = List.of(
            new Todo("Tamerlan", "CanoeSprint"),
            new Todo("Ariz", "Air Force")
    );

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {

        return TODOS_LIST;
    }

    @GetMapping("/users/{username}/todos")
    public Todo retrieveTodosForSpecificUser(@PathVariable String username) {
        return TODOS_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodosForSpecificUser(@PathVariable String username, @RequestBody Todo todo) {
        logger.info("Creating {} for {} ", todo, username);
    }

}

record Todo(String username, String description) {
}
