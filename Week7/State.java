/** File name: State.java
 *  Author: Devere A. Weaver
 *  Date: 8 DEC 2019
 *  Purpose: Create a State object that
 *  deals with its bird and flower. 
 */

public class State {
    // Private variables
    private String[][] stateData = { { "Alabama", "Yellowhammer", "Camellia" },
            { "Alaska", "Willow Ptarmigcan", "Forget-me-not" }, { "Arizona", "Cactus Wren", "Saguaro cactus" },
            { "Arkansas", "Mockingbird", "Apple blossom" }, { "California", "California Valley Quail", "Golden poppy" },
            { "Colorado", "Lark Bunting", "Rocky Mountain Columbine" }, { "Connecticut", "Robin", "Mountain laurel" },
            { "Delaware", "Blue Hen Chicken", "Peach Blossom" }, { "Florida", "Mockingbird", "Orange blossom" },
            { "Georgia", "Brown Thrasher", "Cherokee rose" }, { "Hawaii", "Nene", "Hibiscus" },
            { "Idaho", "Mountain Bluebird", "Syringa" }, { "Illinois", "Cardinal", "Native violet" },
            { "Indiana", "Cardinal", "Peony" }, { "Iowa", "Eastern Goldfinch", "Wild rose" },
            { "Kansas", "Western Meadowlark", "Native sunflower" }, { "Kentucky", "Carindal", "Goldenrod" },
            { "Lousiana", "Eastern Brown Pelican", "Magnolia" }, { "Maine", "Chickadee", "Pine cone and tassle" },
            { "Maryland", "Baltimore Oriole", "Black-eyed Susan" }, { "Massachusettes", "Chickadee", "Mayflower" },
            { "Michigan", "Robin", "Apple blossom" }, { "Minnesota", "Common Loon", "Lady slipper" },
            { "Mississippi", "Mockingbird", "Magnolia" }, { "Missouri", "Bluebird", "Hawthorn" },
            { "Montana", "Western Meadowlark", "Bitterroot" }, { "Nebraska", "Western Meadowlark", "Golderod" },
            { "Nevada", "Mountain Bluebird", "Sagebrush" }, { "New Hampshire", "Purple Finch", "Purple Lilac" },
            { "New Jersey", "Eastern Goldenfinch", "Purple violet" }, { "New Mexico", "Roadrunner", "Yucca" },
            { "New York", "Bluebird", "Rose" }, { "North Carolina", "Cardinal", "Dogwood" },
            { "North Dakota", "Western Meadowlard", "Wild prairie rose" }, { "Ohio", "Cardinal", "Scarlet carnation" },
            { "Okalahoma", "Scissor-tailed Flycatcher", "Mistletoe" },
            { "Oregon", "Western Meadowlark", "Oregon Grape" }, { "Pennsylvania", "Ruffed Grouse", "Mountain laurel" },
            { "Rhode Island", "Rhode Isla a Blue Bonnet" }, { "South Dakota", "Ring-necked Pheasant", "Pasque flower" },
            { "South Carolina", "Great Carolina Wren", "Yellow jessamine" },
            { "Tennessee", "Mockingbird", "Purple iris" }, { "Texas", "Mocking Bird", "Texas Blue Bonnet" },
            { "Utah", "Amarican Seagull", "Sego lily" }, { "Vermont", "Hermit Thrush", "Red clover" },
            { "Virginia", "Cardinal", "Dogwood" }, { "Washington", "Willow Goldfinch", "Western rhododendron" },
            { "West Virginia", "Cardinal", "Rhododendron" }, { "Wisconsin", "Robin", "Wood violet" },
            { "Wyoming", "Western Meadowlark", "Indian paint brush" }, { "", "", "" } };
    private int stateNumber; // Used to obtain state info from stateData array
    private String bird;
    private String flower;
    private String stateName;

    public State(String name) {
        /**
         * Constructor sets the statename, statenumer, state bird, and state flower
         * based on the string passed in by the user.
         */
        stateName = name;
        this.setStateNumber(); // Set the state's number in the constructor
        bird = stateData[stateNumber][1];
        flower = stateData[stateNumber][2];
    }

    private void setStateNumber() {
        /**
         * Function converts user state name intput into an integer value representing
         * the state Set to private to prevent a user from manually setting a state's
         * number.
         */
        switch (stateName) {
        case "alabama":
            stateNumber = 0;
            break;
        case "alaska":
            stateNumber = 1;
            break;
        case "arizona":
            stateNumber = 2;
            break;
        case "arkansas":
            stateNumber = 3;
            break;
        case "california":
            stateNumber = 4;
            break;
        case "colorado":
            stateNumber = 5;
            break;
        case "connecticut":
            stateNumber = 6;
            break;
        case "delaware":
            stateNumber = 7;
            break;
        case "florida":
            stateNumber = 8;
            break;
        case "georgia":
            stateNumber = 9;
            break;
        case "hawaii":
            stateNumber = 10;
            break;
        case "idaho":
            stateNumber = 11;
            break;
        case "illinois":
            stateNumber = 12;
            break;
        case "indiana":
            stateNumber = 13;
            break;
        case "iowa":
            stateNumber = 14;
            break;
        case "kansas":
            stateNumber = 15;
            break;
        case "kentucky":
            stateNumber = 16;
            break;
        case "louisiana":
            stateNumber = 17;
            break;
        case "maine":
            stateNumber = 18;
            break;
        case "maryland":
            stateNumber = 19;
            break;
        case "massachusettes":
            stateNumber = 20;
            break;
        case "michigan":
            stateNumber = 21;
            break;
        case "minnesota":
            stateNumber = 22;
            break;
        case "mississippi":
            stateNumber = 23;
            break;
        case "missouri":
            stateNumber = 24;
            break;
        case "montana":
            stateNumber = 25;
            break;
        case "nebraska":
            stateNumber = 26;
            break;
        case "nevada":
            stateNumber = 27;
            break;
        case "newhampshire":
            stateNumber = 28;
            break;
        case "newjersey":
            stateNumber = 29;
            break;
        case "newmexico":
            stateNumber = 30;
            break;
        case "newyork":
            stateNumber = 31;
            break;
        case "northcarolina":
            stateNumber = 32;
            break;
        case "northdakota":
            stateNumber = 33;
            break;
        case "ohio":
            stateNumber = 34;
            break;
        case "oklahoma":
            stateNumber = 35;
            break;
        case "oregon":
            stateNumber = 36;
            break;
        case "pennsylvania":
            stateNumber = 37;
            break;
        case "rhodeisland":
            stateNumber = 38;
            break;
        case "southcarolina":
            stateNumber = 39;
            break;
        case "southdakota":
            stateNumber = 40;
            break;
        case "tennessee":
            stateNumber = 41;
            break;
        case "texas":
            stateNumber = 42;
            break;
        case "utah":
            stateNumber = 43;
            break;
        case "vermont":
            stateNumber = 44;
            break;
        case "virginia":
            stateNumber = 45;
            break;
        case "washington":
            stateNumber = 46;
            break;
        case "westvirginia":
            stateNumber = 47;
            break;
        case "wisconsin":
            stateNumber = 48;
            break;
        case "wyoming":
            stateNumber = 49;
            break;
        default:
            stateNumber = 50;
            System.out.println("I'm sorry, I did not understand that input. Please try again.");
        }
    }

    // Getters
    public String getBird() {
        /** Return the state object's bird */
        if (stateNumber == 50) {
            bird = "N\\A";
        }
        return bird;
    }

    public String getFlower() {
        /** Return the state object's flower */
        if (stateNumber == 50) {
            flower = "N\\A";
        }
        return flower;
    }

    public String getName() {
        /**
         * Return the state object's name that resides in the stateDate array.
         */
        String stateName;
        if (stateNumber == 50) {
            // 50 is for unrecognized input
            stateName = "ERROR: Not a state";
        } else {
            stateName = stateData[stateNumber][0];
        }
        return stateName;
    }

    public void getStateInfo() {
        /**
         * Return the bird and flower. This function only exists to format the bird and
         * flower of the states. This could have been accomplished by simply using calls
         * to println() in the test file but it's here.
         */
        System.out.println("Bird: " + this.getBird() + "\nFlower: " + this.getFlower() + "\n");
    }
}