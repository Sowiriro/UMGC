/**
 * Created by Soichiro Ono on 12/06/2020.
 * CMIS 141 - Homework 4a
 * This class exists so that the state can be represented
 * as an object as opposed to a multi-dimensional array.
 * The case switch assigns variable data to the State object.
 */


public class State {

    // Private data fields for name, bird, and flower
    private String name;
    private String bird;
    private String flower;

    // toString method to easily display information
    public String toString() {
        return "\nState Name: " + name +
                "\nState Bird: " + bird +
                "\nState Flower: " + flower;
    }

    // Constructor that takes name as an argument
    public State(String name) {
        // Assigns input name to the object's name
        this.name = name;
        // made switch statements which are name, bird, and flower
        switch (this.name) {
            case "alabama":
                this.name = "Alabama";
                this.bird = "Yellowhammer";
                this.flower = "Camellia";
                break;
            case "alaska":
                this.name = "Alaska";
                this.bird = "Willow Ptarmigan";
                this.flower = "Forget-me-not";
                break;
            case "arizona":
                this.name = "Arizona";
                this.bird = "Cactus Wren";
                this.flower = "Saguaro Cactus Blossom";
                break;
            case "arkansas":
                this.name = "Arkansas";
                this.bird = "Mockingbird";
                this.flower = "Apple Blossom";
                break;
            case "california":
                this.name = "California";
                this.bird = "California Valley Quail";
                this.flower = "Golden Poppy";
                break;
            case "colorado":
                this.name = "Colorado";
                this.bird = "Lark Bunting";
                this.flower = "Columbine";
                break;
            case "connecticut":
                this.name = "Connecticut";
                this.bird = "American Robin";
                this.flower = "Mountain Laurel";
                break;
            case "delaware":
                this.name = "Delaware";
                this.bird = "Blue Hen Chicken";
                this.flower = "Peach Blossom";
                break;
            case "florida":
                this.name = "Florida";
                this.bird = "Mockingbird";
                this.flower = "Orange Blossom";
                break;
            case "georgia":
                this.name = "Georgia";
                this.bird = "Brown Thrasher";
                this.flower = "Cherokee Rose";
                break;
            case "hawaii":
                this.name = "Hawaii";
                this.bird = "Nene";
                this.flower = "Hibiscus";
                break;
            case "idaho":
                this.name = "Idaho";
                this.bird = "Mountain Bluebird";
                this.flower = "Syringa";
                break;
            case "illinois":
                this.name = "Illinois";
                this.bird = "Cardinal";
                this.flower = "Native violet";
                break;
            case "indiana":
                this.name = "Indiana";
                this.bird = "Cardinal";
                this.flower = "Peony";
                break;
            case "iowa":
                this.name = "Iowa";
                this.bird = "Eastern Goldfinch";
                this.flower = "Wild Rose";
                break;
            case "kansas":
                this.name = "Kansas";
                this.bird = "Western Meadowlark";
                this.flower = "Native Sunflower";
                break;
            case "kentucky":
                this.name = "Kentucky";
                this.bird = "Kentucky Cardinal";
                this.flower = "Goldenrod";
                break;
            case "louisiana":
                this.name = "Louisiana";
                this.bird = "Pelican";
                this.flower = "Magnolia";
                break;
            case "maine":
                this.name = "Maine";
                this.bird = "Chickadee";
                this.flower = "White Pine Cone and Tassel";
                break;
            case "maryland":
                this.name = "Maryland";
                this.bird = "Baltimore Oriole";
                this.flower = "Black-Eyed Susan";
                break;
            case "massachusetts":
                this.name = "Massachusetts";
                this.bird = "Chickadee";
                this.flower = "Mayflower";
                break;
            case "michigan":
                this.name = "Michigan";
                this.bird = "Robin";
                this.flower = "Apple Blossom";
                break;
            case "minnesota":
                this.name = "Minnesota";
                this.bird = "Common Loon";
                this.flower = "Pink and White Lady's Slipper";
                break;
            case "mississippi":
                this.name = "Mississippi";
                this.bird = "Mockingbird";
                this.flower = "Magnolia";
                break;
            case "missouri":
                this.name = "Missouri";
                this.bird = "Bluebird";
                this.flower = "Hawthorn";
                break;
            case "montana":
                this.name = "Montana";
                this.bird = "Western Meadowlark";
                this.flower = "Bitterroot";
                break;
            case "nebraska":
                this.name = "Nebraska";
                this.bird = "Western Meadowlark";
                this.flower = "Goldenrod";
                break;
            case "nevada":
                this.name = "Nevada";
                this.bird = "Mountain Bluebird";
                this.flower = "Sagebrush";
                break;
            case "new hampshire":
                this.name = "New Hampshire";
                this.bird = "Purple Finch";
                this.flower = "Purple Lilac";
                break;
            case "new jersey":
                this.name = "New Jersey";
                this.bird = "Eastern Goldfinch";
                this.flower = "Purple Violet";
                break;
            case "new mexico":
                this.name = "New Mexico";
                this.bird = "Roadrunner";
                this.flower = "Yucca Flower";
                break;
            case "new york":
                this.name = "New York";
                this.bird = "Bluebird";
                this.flower = "Rose";
                break;
            case "north carolina":
                this.name = "North Carolina";
                this.bird = "Cardinal";
                this.flower = "Dogwood";
                break;
            case "north dakota":
                this.name = "North Dakota";
                this.bird = "Western Meadowlark";
                this.flower = "Wild Prairie Rose";
                break;
            case "ohio":
                this.name = "Ohio";
                this.bird = "Cardinal";
                this.flower = "Scarlet Carnation";
                break;
            case "oklahoma":
                this.name = "Oklahoma";
                this.bird = "Scissor-Tailed Flycatcher";
                this.flower = "Mistletoe";
                break;
            case "oregon":
                this.name = "Oregon";
                this.bird = "Western Meadowlark";
                this.flower = "Oregon Grape";
                break;
            case "pennsylvania":
                this.name = "Pennsylvania";
                this.bird = "Ruffed Grouse";
                this.flower = "Mountain Laurel";
                break;
            case "rhode island":
                this.name = "Rhode Island";
                this.bird = "Rhode Island Red";
                this.flower = "Violet";
                break;
            case "south carolina":
                this.name = "South Carolina";
                this.bird = "Carolina Wren";
                this.flower = "Yellow Jessamine";
                break;
            case "south dakota":
                this.name = "South Dakota";
                this.bird = "Ring-Necked Pheasant";
                this.flower = "American Pasqueflower";
                break;
            case "tennessee":
                this.name = "Tennessee";
                this.bird = "Mockingbird";
                this.flower = "Iris";
                break;
            case "texas":
                this.name = "Texas";
                this.bird = "Mockingbird";
                this.flower = "Bluebonnet";
                break;
            case "utah":
                this.name = "Utah";
                this.bird = "California Gull";
                this.flower = "Sego Lily";
                break;
            case "vermont":
                this.name = "Vermont";
                this.bird = "Hermit Thrush";
                this.flower = "Red Clover";
                break;
            case "virginia":
                this.name = "Virginia";
                this.bird = "Cardinal";
                this.flower = "Dogwood";
                break;
            case "washington":
                this.name = "Washington";
                this.bird = "Willow Goldfinch";
                this.flower = "Western Rhododendron";
                break;
            case "west virginia":
                this.name = "West Virginia";
                this.bird = "Cardinal";
                this.flower = "Big Rhododendron";
                break;
            case "wisconsin":
                this.name = "Wisconsin";
                this.bird = "Robin";
                this.flower = "Wood Violet";
                break;
            case "wyoming":
                this.name = "Wyoming";
                this.bird = "Meadowlark";
                this.flower = "Indian Paintbrush";
                break;
            default:
                this.bird = "No state";
                this.flower = "No flower";
                break;
        }
    }


}