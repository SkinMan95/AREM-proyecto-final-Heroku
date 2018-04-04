package edu.escuelaing.arem.squarenumber;

import java.math.BigInteger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alejandro Anzola email: alejandro.anzola@mail.escuelaing.edu.co
 */
@RestController
@RequestMapping(value = "/square")
public class SquareNumberController {

    @GetMapping
    public @ResponseBody
    String squareNumber(@RequestParam("value") BigInteger value) {
        return value.multiply(value).toString();
    }
}
