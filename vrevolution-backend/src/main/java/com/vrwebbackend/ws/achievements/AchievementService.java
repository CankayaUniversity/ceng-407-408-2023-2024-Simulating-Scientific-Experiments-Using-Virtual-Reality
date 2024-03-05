package com.vrwebbackend.ws.achievements;

import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AchievementService
{
    public ResponseEntity<Object> getUnit1Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Structure and rotation of the Sun\", " +
                "\"topic1Achievement1\": \"The geometric shape of the Sun is mentioned\", " +
                "\"topic1Achievement2\": \"It is mentioned that the Sun consists of layers like the Earth, but the structure of the layers is not mentioned\", " +
                "\"topic1Achievement3\": \"It is stated that the Sun rotates\", " +
                "\"topic2\": \"Structure and Features of the Moon\", " +
                "\"topic2Achievement1\": \"The size of the Moon is indicated\", " +
                "\"topic2Achievement2\": \"The geometric shape of the Moon is mentioned\", " +
                "\"topic2Achievement3\": \"Information is given about the surface structure of the Moon\", " +
                "\"topic3\": \"Movements and Phases of the Moon\", " +
                "\"topic3Achievement1\": \"Explains the rotation and rotation movements of the Moon\", " +
                "\"topic3Achievement2\": \"It is stated that the Moon rotates.\", " +
                "\"topic3Achievement3\": \"Explains the relationship between the phases of the Moon and the Moon's orbit around the Earth\", " +
                "\"topic4\": \"Sun, Earth and Moon\", " +
                "\"topic4Achievement1\": \"Prepares a model representing the movements of the Sun, Earth and Moon relative to each other\", " +
                "\"topic4Achievement2\": \"The direction of the Moon's orbit around the Earth is indicated\", " +
                "\"topic4Achievement3\": \"The direction of the Earth's orbit around the Sun is indicated\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit2Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Observes the existence of microscopic creatures with the help of a microscope\", " +
                "\"topic1Achievement1\": \"Parts of the microscope are not mentioned\", " +
                "\"topic1Achievement2\": \"Necessary precautions regarding safety and hygiene are taken when observing microscopic creatures.\", " +
                "\"topic2\": \"Gives examples of living things and classifies them according to their similarities and differences.\", " +
                "\"topic2Achievement1\": \"Examples are given of microscopic creatures (bacteria, amoeba, euglena and paramecium) and capped mushrooms.\", " +
                "\"topic2Achievement2\": \"A warning is given not to eat poisonous mushrooms.\", " +
                "\"topic2Achievement3\": \"Living things; classified as plants, animals, fungi and microscopic creatures\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit3Grade5Achievement()
    {
        String jsonString = "{\"topic1\": \"Measuring Force\", " +
                "\"topic1Achievement1\": \"Measures the magnitude of the force with a dynamometer\", " +
                "\"topic1Achievement2\": \"Newton (N) is used as the unit of force\", " +
                "\"topic1Achievement3\": \"Designs a dynamometer model using simple tools\", " +
                "\"topic2\": \"Frictional force\", " +
                "\"topic2Achievement1\": \"Gives examples of friction force from daily life\", " +
                "\"topic2Achievement2\": \"Discovers the effect of friction force on motion in various environments by experimenting\", " +
                "\"topic2Achievement3\": \"Generates new ideas to increase or decrease friction in daily life\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit1Grade6Achievement()
    {
        String jsonString = "{\"topic1\": \"Compares the planets in the solar system with each other.\", " +
                "\"topic1Achievement1\": \"Basic characteristics of planets (terrestrial, gaseous, inner planet, outer planet) are mentioned.\", " +
                "\"topic1Achievement2\": \"It is said that planets have satellites.\", " +
                "\"topic1Achievement3\": \"The sizes of the planets are referred to spatially.\", " +
                "\"topic2\": \"Predicts how a solar eclipse occurs.\", " +
                "\"topic2Achievement1\": \"It refers to the phase of the Moon during the solar eclipse.\", " +
                "\"topic2Achievement2\": \"It is mentioned that there is no solar eclipse every month.\", " +
                "\"topic3\": \"Predicts how a lunar eclipse occurs.\", " +
                "\"topic3Achievement1\": \"It refers to the phase of the Moon during a lunar eclipse.\", " +
                "\"topic3Achievement2\": \"It is mentioned that there is no lunar eclipse every month.\"} ";

        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }

    public ResponseEntity<Object> getUnit1Grade7Achievement()
    {
        String jsonString = "{\"topic1\": \"Satellite, space pollution, sky observation tools\", " +
                "\"topic1Achievement1\": \"Explains space technologies.\", " +
                "\"topic1Achievement2\": \"Expresses the causes of space pollution and predicts the possible consequences of this pollution.\", " +
                "\"topic1Achievement3\": \"Explains the relationship between technology and space exploration.\", " +
                "\"topic2\": \"Star, Constellation, Galaxy, Black hole\", " +
                "\"topic2Achievement1\": \"Becomes aware of the star formation process.\", " +
                "\"topic2Achievement2\": \"Explains the concept of star.\", " +
                "\"topic2Achievement3\": \"Explains the structure of galaxies.\"}";
        Gson gson = new Gson();
        Object jsonObject = gson.fromJson(jsonString, Object.class);
        return ResponseEntity.status(HttpStatus.OK).body(jsonObject);
    }
}
