/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author ITRO
 */
public class RegExTemplateSoln {

    public String[] getTweets() {
        String[] twitterTweets = {"Q1. Hey, y'all. My novel SLAY is about a black teen developer who creates a Wakanda-inspired VR video game, and battles a real-life racist troll intent on destroying it. It'll be out in Fall '19 from Simon Pulse! #novel19s",
            "Mary Bono found out she is expendable and Simone Biles is not. #carryon #byeMary",
            "The world is pretty terrible right now, but a friend is undergoing major surgery to give my wife a life-changing kidney transplant. That's amazing.",
            "Soooo I'm actually seeing people on the left say that the Cherokee Nation is wrong for their statement and I'm about done with all y'all today.",
            "@AngryBlackLady Sounds about white.",
            "On the cover of Captain America's 1st issue, he punched Adolf Hitler in the face. Enraged, American Nazis called Marvel with threats &amp; loitered in the streets outside. So creator Jack Kirby rolled up his sleeves &amp; went outside to punch them too.   Today's Marvel? Not so much.",
            "Dad: *pauses tv* Rose, tell me about today Rose: it was good. S. cried a lot D: oh no, do you know why? R: Maybe he wanted to watch TV but they wouldn't let him. R: *mic drop* *Dad and mom laugh* R: Or maybe they made him go to school when he didn't want to. R: *Stares at Dad*",
            "Washington state's Supreme Court has struck down the death penalty  https://t.co/HhJp03OHVv",
            "Good night from Geordi La Forge @joanwalsh!  https://t.co/y9ZoBhyN4B",
            "This thread has all the childhood dream feels. :) https://t.co/0bqvMoVCnD",
            "@freepsports Never a fan of Rod #love Gibby",
            "I own a lightsaber now. Just thought you should know. https://t.co/RLMXQbXUcg",
            "@LauraLoomer It's not a war on men..... it's a war on sexism and sexual assault... pls get it together and do some research. Feminism is not about hating men &amp; those that do hate aren't real feminists",
            "@wolfonthehill @SteveKornacki Women are more likely to vote than men. https://t.co/t2wBpfXqNB",
            "@ClaireOfTarth @KYCERO @LauraLoomer https://t.co/PFcL3lNWzS",
            "just teach your kids about consent and shut the fuck up lmao weird bitch https://t.co/WWtj1gvhPf",
            "@KYCERO @LauraLoomer Hey you know what, I think I speak for all women when I say... we're okay with that!",
            "Happy #IndigenousPeopleDay !",
            "@NYDailyNews My PTSD was fairly well controlled until Dr. Ford came forward. Then seeing Kavanaugh in the hearings, I started having flashbacks because his anger and hatred reminded me SO MUCH of my abusive ex. Yes, some of us do see SO's in him, if we have/had toxic men in our lives. Not all",
            "@NYDailyNews Why don't they see their daughter, sister, wife in Christine Blasey-Ford and Deborah Ramirez?  Is Conway saying only men's lives and feelings really matter in tRump's America. @KellyannePolls",
            "Do you ever think about how Silicon Valley figured out how to fit more servers in by stacking them on top of each other but they haven't figured out you can do that with homes.",
            "I don't want to hear your moralizing. You moralized while I fought Nazis. And now I've helped take down multiple Nazi groups and changed military policy and I didn't do it through moralizing.  You want your rights?  Roll up your sleeves and start getting ready for a dirty fight.",
            "Maybe focus first on keeping your son from assaulting women? https://t.co/btIsiMdmwA",
            "We're cancelling a planned six-figure digital video ad expenditure for Phil Bredesen in Tennessee due to his Kavanaugh position. And similarly will be pulling all planned campaigning on behalf of Joe Manchin in West Virginia if he votes yes. Kavanaugh is unfit for the Court.",
            "If he doesn't get confirmed then all of Brett's screaming and crying will have been for Kavanaught.",
            "Today, @lisamurkowski came through. Thank you.",
            "Proud of you, @lisamurkowski. Thank you for putting our democracy first. #StopKanavaugh",
            "You're one of my senators so how about telling your constituents in as much detail as possible what the report said @SenGillibrand? https://t.co/SPZqsf2j9I",
            "@sam2lucky13 @SenWhitehouse @ScottHech What BS. Where there's so much smoke, there's fire. There was no smoke around Gorsuch, even though his seat was stolen from America Garland.",
            "Thank you @SenatorHeitkamp for believing women and seeing how Kavanaugh   has disqualified himself with his temperament and his lies. https://t.co/U8eYfvopQN",
            "The reason sex with a vampire doesn't usually result in pregnancy isn't because their sperm is dead, it's because the vampire can't come inside without an invitation.  Thank you for coming to my HaunTED Talk.",
            "At Cal Anderson Park in Seattle: vigil protesting Kavanaugh. #StopKavanaugh",
            "There's a couple on the train holding hands. One is in a Caps Jersey, one in a Bruins. I'm a sucker for an interhockey romance.",
            "A portrait of @Malala was just unveiled at @NPGLondon. The activist said that she hoped it would remind visitors that girls everywhere are fighting for change in their communities and countries - their stories must also be heard. https://t.co/YHAmQaKiaB",
            "Reservation life, Navajo history, and the larger history of Native Americans in the United States come together in visceral, intuitive poetry marked by a personal and collective cultural experience.  On @sbitsui's DISSOLVE, forthcoming 10/30 (@POETSorg): https://t.co/ZUa93bFSFq",
            "current dystopia status: retroactively rooting for ub40 in a fist fight",
            "@EricBoehlert ...definitely did not have chris dudley + ub40 + bar fight anywhere on my kavanaugh madness bingo card... https://t.co/wLAyKfa9UC",
            "The Kavanaugh stuff is incredibly grim and dark, but I do get some small pleasure out of reading sentences like ",
            "For those arguing that the Founding Fathers designed the Senate this way through the Constitution to make sure States had equal representation...  Here's James Madison saying it was actually about preserving slavery. (From @CoreyRobin) https://t.co/KUradAoTBJ",
            "How will we ever confirm her? https://t.co/ZvbvRO5CMH",
            "Ching Shih was a prostitute born in 1775 who became the most feared pirate queen in all of China - launching the infamous Red Flag Fleet.   The Chinese government sent their ships after her to put her to death. She pirated and stole those ships too.   Died running a gambling den. https://t.co/kDYVXy7Xj2",
            "Okay but what if M'Baku were a woman?  Photos by:@worldofgwendana   #blackpanther #wakandaforever #mbaku #blackcosplay #blackcosplayerhere https://t.co/lanys1fukR",
            "Cree doctor honoured for 30-years of service on First Nations reserves https://t.co/gUdWZb0oa0",
            "Dispatches from the most beautiful law school in America. @UMichLaw https://t.co/AOcgfl68G8",
            "Always look to see who is in a hurry. As Tacitus wrote, ",
            "@A2Lintra Kamala Harris sent around the hat for survivor groups (including RAINN) this morning. I gave &amp; I feel a little less bad.",
            "@benramosss @orangerie___ They didn't know the guys, they could barely walk.. they could barely stand.. I'm happy I took them home. Because I know what was about to go down, and not on my watch",
            "i was just in a convenience store and saw a woman in her 60s lean over to read a newspaper headline about the #KavanaughVote and she said ",
            "No one was on trial yesterday but it feels like all survivors were sentenced to life in prison.",
            "great day for unfollowing straight white dudes who talk about a self-propagating hegemony of unrepentant rapists like a fun interesting thought experiment and not a reason to burn mansions by the acre and erect a scaffold for this neat guillotine i just built",
            "Every single man who is angrily defending Kavanaugh should be immediately investigated for sexual assault.  #BelieveChristine",
            "A 92-year-old woman has been buried in Nebraska with British military honors for a secret that she held for decades: her World War II service as a codebreaker of German intelligence communications https://t.co/dfKvKvWe0m",
            "@ZoeTillman If they didn't document the rape in their 1982 calendar that they still have how will we be able to believe them?",
            "Imagine being so brave that you come forward with testimony that will likely ruin your own life just to protect the lives of strangers.  Thank you, Dr. Blasey Ford. Thank you, Deborah Ramirez. Thank you, Julie Swetnick. https://t.co/7SaE3hYpiU",
            "Finally got to have coffee in NY with my Twitter buddy @scalzi. We're already planning tea in London! https://t.co/Pt2YnnBxEY",
            "I literally just screeched ",
            "I'm breaking out of this place. Thank you for all of your kind words and prayers. Thank you @HenryFordNews for your phenomenal staff. And thank you @UMichFootball and the @Lions for not further complicating my health this weekend. Blessings on you all. https://t.co/YiFbTXUnOx",
            "NPR is doing a story about this new innovation called home sharing for seniors. Because I guess they don't own a TV? https://t.co/jFZVfIo1Th",
            "Andrea Kremer And Hannah Storm Will Be First Female Duo To Call An NFL Game https://t.co/MaQDW0c82p",
            "Thought for the day, from a FB friend: I wish I could get through a day without having to hear about another Republican penis.",
            "@WayneFreedman @WildRootsStudio Having been the victim of an otherwise wonderful  man who had abhorrent behavior when drunk, I almost feel sorry for Kavanaugh, BUT the wonderful man I knew felt horrible about his behavior, apologized, backed that up by getting sober. He faced his demons squarely in the face.",
            "No one who enjoyed high school should be hired for anything",
            "yo I formally accepted the offer...looks like I'm going to be in a writer's room!!??",
            "Marco Rubio. https://t.co/LAF5kdsEyY",
            "Dear men who have opinions about how women (including politicians) are dealing with all this sexual assault bullshit: STFU. No love, me.",
            "Who is this team and what have they done with my Lions?",
            "I am always in awe of teenage girls who can look this fuckery in the eye and speak out loud, with clarity  and conviction. ",
            "https://t.co/CCnIl9yVvH",
            "@davidgura @maggieNYT @MSNBC @HeidiPrzybyla @GarrettVentry @NBCNews Quick, someone wake up Hatch so he can garble that the woman who filed the complaint must be crazy.",
            "@foswi @svdate @davidgura @MSNBC @HeidiPrzybyla @GarrettVentry @NBCNews Waiting to hear that the Federalist Society was confused and mixed up. They meant to nominate the guy who looks like Kavanaugh.",
            "My daughter Zoe Bleu",
            "I was manipulated and sexually abused and am in the process of claiming my power back ..and when I'm ready to talk publicly about it I will be heard and not hated but forgiveness and understanding which is the hardest hurdle to overcome everyone who wounds is wounded themselves",
            "W.E.B. Du Bois Medals will be presented to Colin Kaepernick, Dave Chappelle, Kenneth I. Chenault, Shirley Ann Jackson, Pamela J. Joyner, Florence C. Ladd, Bryan Stevenson, and Kehinde Wiley on Oct 11 https://t.co/H0IttulsjL",
            "My daughter Zoe does not want to participate on twitter herself , but said I could  quote her. It's her story tell",
            "To all the strangers on social media telling me to shave my arms: I actually like my body hair, thank you very much. Let's stop making it such a crime for women to like themselves. #supportwomen https://t.co/qkGXhUFCNy",
            "The collected edition of my creator-owned comic ABBOTT, about a journalist in 1970s Detroit fighting dark sorcery, comes out next month. Preorders are a huge deal in the book world, so I'd really appreciate folks spreading the word and preordering. Some sample pages below! https://t.co/NfZdFxJs5S",
            "That is why I believe Dr. Christine Blasey Ford.",
            "@VancityReynolds Can we have @AnnaKendrick47 as Lady Deadpool?",
            "Never is it more evident that sexual preference isn't a choice than in the fact that every woman over 35, no matter where she started, isn't now a lesbian.",
            "@jemelehill You understood that the men and women who play sports are complex, interesting and not just there to be used as entertainers.  Keep speaking my sister and bless all your future endeavors.",
            "I hope they cast a black Superman. It would nice for a brotha to finally be faster than a speeding bullet.",
            "Having marijuana in your house is a perfectly rational response to a world where the police can break into and kill you because they feel like it.",
            "@auchamps4life @4kris2say @surge214_sergio @NYDailyNews @lkjtexas Background checks aren't as detailed depending on your clearance. Usually, they just look to see if you lied about your criminal record. A Supreme Court nomination is going to warrant deeper scrutiny. But hey, he should be happy, at least he got his hearing. Garland didn't",
            "@THR Straight guys having group fun is Literally Happening EVERY DAY, in EVERY TOWN &amp; in every HS &amp; College. This the the Most COMMON thing. I'm amazed it takes a Legend like Paul McCartney to publicly announce what Everybody has been doing for ever. I'm more amazed anyone is unaware",
            "Well, @Lin_Manuel knows where I am when he wants to collaborate. https://t.co/iTUuTsZrxn",
            "@THR Now I don't feel so bad about all the times I masturbated with friends",
            "Hey, NYC, you old survivor, you.   Looking pretty spry for 394 years of age.   Nothing keeps you down for long, old girl.",
            "To combat the spread of that awful racist cartoon, this is the image that should go viral. Two awesome women supporting each other. https://t.co/Qlvb9f06VU",
            "dance like nobody's watching   love like you'll never get hurt  respect women in the workplace like you'll never have to necessitate ronan farrow writing an expose about your actions",
            "@transscribe Did you say Hi to Melania?",
            "when Rey restored hope by letting everyone know she'd found Master Skywalker's address she became a...  Luke Dox Hero",
            "@Canadia72717997 @axios @ldupc3 Hi bot!",
            "@Jevholution Bruhhh the first comment  https://t.co/QvkqiBkKI4",
            "Like all those old men shaking their fist at the clouds about Kaepernick really were going to buy more Nikes anyway.",
            "Me, looking to see if anybody burns some Jordans rather the Nike's they got on the clearance rack https://t.co/5ZKHvpqJOP",
            "@Kaepernick7 The message came FROM the messengers: they are not disrespectful of the flag, the USA or troops simply because they want respect and equality for their fellow citizens. This Vet respects his courage to try and change our country for the better.",
            "@Peter_Dickerson @Kaepernick7 Girl you aren't Nike's demographic anyway lol bye",
            "@Bil_Lea4691 @susieq39475 @Kaepernick7 @crystalchappell Nike owns Converse.",
            "My hope is that when I pass away, improvisers across North America lower their pants to half-mast."};

        return twitterTweets;
    }

    /**
     *
     * TO-DO code here the logic on how you will clean each tweet. The idea is
     * to remove the following: - links - numbers - words that contains '@' and
     * '#'
     *
     * @param tweet a string that will be cleaned.
     * @param patterns list of pattern that will be used to clean the tweet.
     *
     * @return cleaned tweet.
     */
    public String getCleanedTweet(String tweet, String[] patterns) {

        for (String patt : patterns) {
            tweet = tweet.replaceAll(patt, "");
        }
        return tweet;
    }

    /**
     * TO-DO code here the logic that reads a text file containing tweets (Only
     * the first 100 tweets). The method should return the texts in the file.
     * And, change the main() method to use this method().
     *
     * @param pathName the location of the file that will be read.
     *
     * @return top 100 tweets in the text file.
     */
    public String[] fileReading(String pathName) {

        String[] tweetArray = null;

        return tweetArray;
    }

    /**
     * TO-DO code here the logic that counts the word of the data.
     *
     * @param tweets collection of CLEANED tweets.
     *
     * @return total counts of words in the tweets
     */
    public int countWords(String[] tweets) {
        int counter = 0;
        for (String tweet : tweets) {
            counter += tweet.split(" ").length;
        }
        return counter;
    }

    /**
     * TO-DO code here the logic that counts the characters of the data.
     *
     * @param tweets collection of UNCLEANED tweets.
     *
     * @return total counts of words in the tweets
     */
    public int countCharacters(String[] tweets) {
        int counter = 0;
        for (String tweet : tweets) {
            counter += tweet.length();
        }
        return counter;
    }

    /**
     * TO-D0 code here the logic that counts the passed word of the user from
     * the data.
     *
     * @param word string that will be searched and count in the data.
     * @param tweets collection of CLEANED tweets.
     *
     * @return total counts of word in tweets.
     */
    public int countSpecificWord(String word, String[] tweets) {

        int total = 0;
        // slice the data per sentence
        for (String perSentence : tweets) {
            // Check frequency count of the word in a sentence.
            for (String perWord : perSentence.split(" ")) {
                if (word.equalsIgnoreCase(perWord)) {
                    total++;
                }
            }
        }
        return total;
    }

    /**
     * TO-D0 code here the logic that counts the sum of tweets that starts and
     * ends base on the parameter passed.
     *
     * @param startLet first character of the tweet that will be searched in the
     * data.
     * @param endLet last character of the tweet that will be searched in the
     * data.
     * @param tweets collection of CLEANED tweets.
     *
     *
     */
    public void displayWithStarEndLetter(char startLet, char endLet, String[] tweets) {
        // example: ^a.*b$
        String pattern = "^" + startLet + ".*" + endLet + "$";
        int total = 0;
        for (String perSentence : tweets) {
            if (perSentence.matches(pattern)) {
                total++;
            }
        }
        System.out.println("Number of tweets: " + total);
    }

    public static void main(String[] args) {

        RegExTemplateSoln template = new RegExTemplateSoln();

        /**
         * TO-DO: Populate the regular expression patterns that you will use to
         * clean the tweets.
         */
        String[] patterns = {"([0-9])",
            "(https?:\\S+ ?)",
            "@\\S+ ?",
            "#\\S+ ?"};

        String[] rawData = template.getTweets();
        String[] processedData = new String[rawData.length];
        for (int counter = 0; counter < rawData.length; counter++) {
            processedData[counter] = template.getCleanedTweet(rawData[counter], patterns);
        }

        System.out.println("Total words: " + template.countWords(processedData));
        System.out.println("Total length: " + template.countCharacters(rawData));
    }
}
