package com.capstoneproject.Empower.components;



import com.capstoneproject.Empower.models.Affirmation;
import com.capstoneproject.Empower.models.Category;
import com.capstoneproject.Empower.models.Forum;
import com.capstoneproject.Empower.repository.AffirmationRepository;
import com.capstoneproject.Empower.repository.CategoryRepository;
import com.capstoneproject.Empower.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    AffirmationRepository affirmationRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ForumRepository forumRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Category category1 = new Category("Positive self-affirmations");
        categoryRepository.save(category1);

        Category category2 = new Category("Gratitude affirmations");
        categoryRepository.save(category2);

        Category category3 = new Category("Abundance affirmations");
        categoryRepository.save(category3);

        Category category4 = new Category("Relationship affirmations");
        categoryRepository.save(category4);

        Category category5 = new Category("Confidence affirmations");
        categoryRepository.save(category5);

        Category category6 = new Category("Health affirmations");
        categoryRepository.save(category6);

        Category category7 = new Category("Forgiveness affirmations");
        categoryRepository.save(category7);

        Category category8 = new Category("Creativity affirmations");
        categoryRepository.save(category8);

        Category category9 = new Category("Your Journey");
        categoryRepository.save(category9);

        Category category10 = new Category("Social Situations");
        categoryRepository.save(category10);

        Category category11 = new Category("The Gym");
        categoryRepository.save(category11);

        Category category12 = new Category("Overthinking");
        categoryRepository.save(category12);

        Category category13 = new Category("Personal Development");
        categoryRepository.save(category13);

        Category category14 = new Category("New Habits");
        categoryRepository.save(category14);

        Category category15 = new Category("Fear Of Missing Out");
        categoryRepository.save(category15);

        Category category16 = new Category("Grief");
        categoryRepository.save(category16);

        Category category17 = new Category("Appreciation");
        categoryRepository.save(category17);

        Affirmation affirmation1 = new Affirmation("I am grateful for all the good things in my life, and I appreciate the blessings that come my way every day.", 5, category2);
        affirmationRepository.save(affirmation1);

        Affirmation affirmation2 = new Affirmation("I am worthy of love and respect, and I believe in my abilities to achieve my goals.", 5, category1);
        affirmationRepository.save(affirmation2);

        Affirmation affirmation3 = new Affirmation("I am attracting abundance and prosperity into my life, and I trust that the universe will provide me with everything I need.", 5, category3);
        affirmationRepository.save(affirmation3);

        Affirmation affirmation4 = new Affirmation("I am surrounded by people who love and support me, and I am grateful for the positive relationships in my life.", 3, category4);
        affirmationRepository.save(affirmation4);

        Affirmation affirmation5 = new Affirmation("I am confident in myself and my abilities, and I know that I can accomplish anything I set my mind to.", 4, category5);
        affirmationRepository.save(affirmation5);

        Affirmation affirmation6 = new Affirmation("I am taking good care of my body and mind, and I am grateful for my good health and well-being.", 4, category6);
        affirmationRepository.save(affirmation6);

        Affirmation affirmation7 = new Affirmation("I forgive those who have hurt me, and I release all negative feelings and emotions from my heart.", 2, category7);
        affirmationRepository.save(affirmation7);

        Affirmation affirmation8 = new Affirmation("I am a creative and imaginative person, and I am always finding new and exciting ways to express myself.", 4, category8);
        affirmationRepository.save(affirmation8);

        Affirmation affirmation9 = new Affirmation("BE HOPEFUL - Doesn’t matter how painful or how well you’re doing be hopeful for everything. Hopefulness is your magical shield. Remember in The Sandman when he goes toe to toe with the Devil. She throws at him the apocalypse and end of life, but he prevails with his hopefulness. You can be hopeful for everything and it’s a powerful spell!", 5, category9);
        affirmationRepository.save(affirmation9);

        Affirmation affirmation10 = new Affirmation("STOP COMPARING YOURSELF TO OTHERS - The grass is always greener in their garden. Compare yourself only to your yesterday self. Be proud of your own little bubble!", 5, category9);
        affirmationRepository.save(affirmation10);

        Affirmation affirmation11 = new Affirmation("INJECT THE HOLISTIC APPROACH - Are you doubting yourself? Well, think of the holistic approach. Contemplate the worst possible outcome then to the mediocre then be super descriptive about the best! This should only be brief. It’s not a sob story!", 5, category9);
        affirmationRepository.save(affirmation11);

        Affirmation affirmation12 = new Affirmation("PASS THE PLOT TWIST TEST - In life, you’re going to be capsized with plot twists so best to remain calm and keep afloat.  This will be when you’re tested. Pass the test.", 5, category9);
        affirmationRepository.save(affirmation12);

        Affirmation affirmation13 = new Affirmation("Doesn’t matter how painful or how well you’re doing be hopeful for everything. Hopefulness is your magical shield. Remember in The Sandman when he goes toe to toe with the Devil. She throws at him the apocalypse and end of life, but he prevails with his hopefulness. You can be hopeful for everything and it’s a powerful spell!", 5, category9);
        affirmationRepository.save(affirmation9);

        Affirmation affirmation14 = new Affirmation("THE FEELING OF QUITTING IS WORSE A HUNDRED TIMES WORSE - Think of the money and life you could achieve if you persevere! I know you think you’re in hell. But why stop? Keep going and get a reward for it! ", 5, category9);
        affirmationRepository.save(affirmation14);

        Affirmation affirmation15 = new Affirmation("TED LASSO’S ADVICE – “it may not work out how you think it will or how you think I will or how you hope it does, but believe me, it will all work out. Exactly as it’s supposed to!", 5, category9);
        affirmationRepository.save(affirmation15);

        Affirmation affirmation16 = new Affirmation("KEEP YOUR CARDS CLOSE TO YOUR CHEST – Be careful who you tell about your goals or what you’re proud of. This is where you’re most vulnerable and if they don’t like it or don’t respond well then it could upset you and it may ruin your focus. Actions speak louder than words anyway. If you feel cornered and are about to reveal to someone, you’re not 100% sure of, ask a question for them to answer, change the subject. People love speaking about themselves and don’t really care about what you’ve got to say. It’s just conversation. People don’t want an awkward silence, so they’ll talk about anything.", 5, category9);
        affirmationRepository.save(affirmation16);

        Affirmation affirmation17 = new Affirmation("BEWARE OF YOUR AMBITIOUS EGO – don’t make your goals into your ego. You can ruin your goal easily and twist it into a toxic bond.", 5, category9);
        affirmationRepository.save(affirmation17);

        Affirmation affirmation18 = new Affirmation("ENJOY THE JOURNEY – take it in. Be patient. You won’t experience this ever again.", 5, category9);
        affirmationRepository.save(affirmation18);

        Affirmation affirmation19 = new Affirmation("SUCCESS TAKES TIME, IF IT WAS EASY EVERYONE WOULD DO IT - it’s going to be boring, and it’ll probably make you cry but hang in there! I believe in you. ", 5, category9);
        affirmationRepository.save(affirmation19);

        Affirmation affirmation20 = new Affirmation("FAKE IT UNTIL YOU MAKE IT – play as someone who is relaxed and cool as Pedro Pascal!", 5, category10);
        affirmationRepository.save(affirmation20);

        Affirmation affirmation21 = new Affirmation("ANIMATIC LISTENING - When you’re listening, imagine a little animation in your head of the context of whatever is spoken. ", 5, category10);
        affirmationRepository.save(affirmation21);

        Affirmation affirmation22 = new Affirmation("C.S. LEWIS ADVICE – “True humility is not thinking less of yourself, it’s thinking of yourself less.", 5, category10);
        affirmationRepository.save(affirmation22);

        Affirmation affirmation23 = new Affirmation("BE A FUN ENERGY –It rubs off and makes people happy. ", 5, category10);
        affirmationRepository.save(affirmation23);

        Affirmation affirmation24 = new Affirmation("SAY PEOPLES NAMES… - Remember people’s names and say it. It’s the magic word for them. Everyone loves hearing their name. It’ll show you listen and are making an effort for them. Then they’ll most likely make an effort for you. It’s a win, win!", 5, category10);
        affirmationRepository.save(affirmation24);

        Affirmation affirmation25 = new Affirmation("DON’T MOAN OR WHINE – No one wants to hear that. Think of Spiderman 2, how Peter Parker goes through so much shit without whining. It’s so attractive and admirable. You’ll receive better help from other people, if you need it, without ruining their mood.  ", 5, category10);
        affirmationRepository.save(affirmation25);

        Affirmation affirmation26 = new Affirmation("CONCENTRATE ON YOUR SPEECH - Don’t shout; speak quietly purposely and concisely. Remember to pause. Pausing displays macho confidence if done correctly and people will give you the space to finish your sentence. No one likes an unnecessary “like…” or “emm… ” to fill in the silence, because that alerts them that you’re struggling to finish your sentence and it feels awkward, then the conversation ends.", 5, category10);
        affirmationRepository.save(affirmation26);

        Affirmation affirmation27 = new Affirmation("EVERYONES FAVOURITE TOPIC IS THEMSELVES – Try to be more interesting than interesting. Give them the centre of attention, they’ll thank you for it. This is a lot better than incessantly pouring out constant stories of your self-indulgent self.", 5, category10);
        affirmationRepository.save(affirmation27);

        Affirmation affirmation28 = new Affirmation("ENOUGH OF THE MISREPRESENTED “FACTS” OR HALF-BAKED STORIES– if you can’t describe it to 100% (fact checked your “facts” or have a clear-cut start, middle and ending to your story), then maybe best to not tell it. You don’t want to mislead people with false information or a story that’s basically word vomit. It displays lack of confidence and intelligence.", 5, category10);
        affirmationRepository.save(affirmation28);

        Affirmation affirmation29 = new Affirmation("TEASERS ALL THE WAY – people have less patience for most stories so maybe best to give them a teaser of your story before you land them with a monologue they didn’t ask for. Most cases, tell them a glimpse of the ending and if they interact – that gives you an invitation to expand upon. ", 5, category10);
        affirmationRepository.save(affirmation29);

        Affirmation affirmation30 = new Affirmation("IT’S TOTALLY FINE TO NOT BE PERFECT – you won’t say or do the right thing all the time so don’t beat yourself up. If you think you have fucked up with somebody, more than likely, it’ll be forgotten about that individual anyway. They’ll be analysing themselves, we’re all narcissists in different shapes of form.", 5, category10);
        affirmationRepository.save(affirmation30);

        Affirmation affirmation31 = new Affirmation("BEING HONEST IS THE BEST POLICY – Even if you feel vulnerable – own it!", 5, category10);
        affirmationRepository.save(affirmation31);

        Affirmation affirmation32 = new Affirmation("LOOK FOR FAMILIARITY - people like to have a connection to someone they see familiar. It's relaxing because you can be yourself. But don’t force it or lie, it’s obvious and you can be seen as untrustworthy to them.", 5, category10);
        affirmationRepository.save(affirmation32);

        Affirmation affirmation33 = new Affirmation("BE HUMBLE – You’re not going to get brownie points for showing off your rip-roaring speed or your tenacious strength from pushy cockiness. No one likes a show off. Be like Yun-Sung Bin and Jung Hae-Min from Netflix’s Physical 100. Both are quiet but athletes in their field. I recognise it's super hard to not boast since you’re on a high with adrenaline but if you succeed in being modest, be a team player, show respect… It'll be so cool!", 5, category11);
        affirmationRepository.save(affirmation33);

        Affirmation affirmation34 = new Affirmation("DON’T INJURE YOURSELF TO FIT IN - Be confident of the weights or activities you’re capable of doing. Focus on technique. Don’t try to show off then injure yourself. That isn’t cool! ", 5, category11);
        affirmationRepository.save(affirmation34);

        Affirmation affirmation35 = new Affirmation("YOU’RE NOT THE MAIN CHARACTER IN ANYONE'S MOVIE – focus on your life just like they’re doing for theirs.", 5, category12);
        affirmationRepository.save(affirmation35);

        Affirmation affirmation36 = new Affirmation("“EMPOWER ME” WORKS – remember how shit you’ve felt when you’ve neglected your app? And how great you’ve felt when you’ve returned to it? It’s not a coincidence. You can always return here, instead of wasting hours catastrophizing bullhockey.", 5, category12);
        affirmationRepository.save(affirmation36);

        Affirmation affirmation37 = new Affirmation("THE QUICKER YOU’RE OVER IT THE BETTER, BRUSH IT OFF – If a worry pops into your head just say to yourself, “no problem”, then move on. Take control!", 5, category12);
        affirmationRepository.save(affirmation37);

        Affirmation affirmation38 = new Affirmation("THE CHINESE FARMER – his son breaks his leg but that stops him from being drafted into the army. When the farmer loses his horse, his horse finds two other horses and returns home with his friends. Everything happens for a reason. Don’t regret anything. Nothing is cemented, unless you’re dead.", 5, category12);
        affirmationRepository.save(affirmation38);


        Affirmation affirmation39 = new Affirmation("EVERYTHING WILL BE OKAY – whatever situation. ", 5, category12);
        affirmationRepository.save(affirmation39);


        Affirmation affirmation40 = new Affirmation("RASHOMON EFFECT - Everyone has different versions of their past events. Not everyone is going to think what you thought happened verbatim.", 5, category12);
        affirmationRepository.save(affirmation40);


        Affirmation affirmation41 = new Affirmation("SPEAKING TO OTHERS HOW YOU FEEL IS GOOD BUT… - most people want to be just reassured you’re fine. If they ask, “how you are '' and you reply to them about your struggles. They’ll most likely give you their full attention and try to help you the best way they can but if you keep resetting like Leonardo Dicapro’s character in Shutter Island and going at it again, then you can become a dementor for them. Everyone has got enough shit in their lives, it’s too much responsibility, and it’s very hard to respond to. Including family - the most, not just targeting friends who can easily keep their distance from you. Your family loves you and will be sucked into your toxic demeanour. It’s great to talk to them honestly, that’s what family is for, but you need to help yourself and not just make them into your psychiatrists because that’s unfair. Most of the time these issues are minuscule and they’re just being catastrophize from unclear one-sided thoughts ONLY FROM YOU. Don’t make them worried and making them put tons of effort for something that will probably be fixed very soon and/or wasn’t worth your agonising worry.", 5, category12);
        affirmationRepository.save(affirmation41);

        Affirmation affirmation42 = new Affirmation("RECOGNISE YOUR EMOTIONS – They’re not a definitive version of yourself and you need to watch out for the poisonous ones. The cure – separate yourself and call them out. “Anxiety..” acknowledge it… l belittle it… feel it… then brush it off!", 5, category12);
        affirmationRepository.save(affirmation42);

        Affirmation affirmation43 = new Affirmation("JOJO RABBIT ADVICE – “Let everything happen to you. Beauty and terror. Just keep going. No feeling is final.", 5, category12);
        affirmationRepository.save(affirmation43);

        Affirmation affirmation44 = new Affirmation("WORK WITH WHAT YOU’VE GOT - Don’t live for a miracle to happen. You whining about it or regretting your “wish I did that” or “wish I had more time” is pointless. There’s no Riders of Rohan coming to save the day, but you can be the Riders of Rohan, instead, if you get your shit together!", 5, category12);
        affirmationRepository.save(affirmation44);

        Affirmation affirmation45 = new Affirmation("BEWARE OF VOLDERMORT (THE VOICE IN YOUR HEAD) – Harry Potter being taught Occlumency wasn’t an empty hollow idea. I believe JK Rowling created this part in her franchise for an analogy fighting overthinking. Minimising the demon lurking about, poisoning you to psychoanalyse everything! Tell He who must not be named to be quiet.", 5, category12);
        affirmationRepository.save(affirmation45);

        Affirmation affirmation46 = new Affirmation("GETTING OUT OF BED IS YOUR FIRST HUGE VICTORY OF THE DAY – it’s horrific. Your poor mind is regularly imploding with anxieties that are trying their best to chain you to your bed and make you go over your top 100 worst moments all day… Once you’re up - don’t hit that snooze button - and have made your bed – you should feel so proud of yourself! You’ve defeated one of your biggest hurdles already.", 5, category12);
        affirmationRepository.save(affirmation46);

        Affirmation affirmation47 = new Affirmation("HOW MANY TIMES HAVE YOU WORRIED ABOUT SOMETHING THAT’S CAME TRUE? OR YOU WERE THANKFUL FOR WORRYING ABOUT IT? THE FUTURE IS IMPOSSIBLE TO PREDICT – You think you’re protecting yourself but you’re just inflicting unnecessary pain to yourself. Maybe that argument you’ve been anticipating ends up being a brief mediation or that course that seems unwinnable might be the best thing you ever did… Your imagination is always going to be worse. Imagine something better. \n", 5, category12);
        affirmationRepository.save(affirmation47);

        Affirmation affirmation48 = new Affirmation("MEDIATE WITH YOURSELF - If you must contemplate a worry, maybe just give yourself a few minutes to mediate with yourself. You could say it out loud and if you cringe then most likely your mind is just playing tricks with you. ", 5, category12);
        affirmationRepository.save(affirmation48);

        Affirmation affirmation49 = new Affirmation("IT’S OKAY TO BE TIRED –Eat whatever you want. Everyone else does it, and they seem to be just fine.", 5, category12);
        affirmationRepository.save(affirmation49);

        Affirmation affirmation50 = new Affirmation("ART OF NOT GIVING A F*** - Care less about what other people think and don’t be judgy of others.", 5, category12);
        affirmationRepository.save(affirmation50);

        Affirmation affirmation51 = new Affirmation("IT MIGHT BE EXCITEMENT – you feeling nervous about that night out? Maybe it’s excitement. They’re the same feeling and you’re choosing anxiety? Choose excitement! ", 5, category12);
        affirmationRepository.save(affirmation51);

        Affirmation affirmation52 = new Affirmation("BEWARE OF THE VAMPIRES – don’t consume yourself to negative energy around you. Cynicism, mean spirited, bullying and stupid people.", 5, category12);
        affirmationRepository.save(affirmation52);

        Affirmation affirmation53 = new Affirmation("POWER OF NOW – focus on your breathing to keep you living in the now. ", 5, category12);
        affirmationRepository.save(affirmation53);

        Affirmation affirmation54 = new Affirmation("IF THERE’S A DIY OR A COOKING SITUATION THAT YOU COULD PARTICIPATE IN, JOIN! – It’s super attractive and handy to be that guy. Shows you’re capable of looking after your girlfriend.", 5, category13);
        affirmationRepository.save(affirmation54);

        Affirmation affirmation55 = new Affirmation("BE DECISIVE AS MUCH AS POSSIBLE – be a leader and decide. The more you waste time contemplating you’re killing time. Pretend you’re losing money the longer you’re thinking/worrying about a decision. If it’s an important decision, breathe and think of it holistically. Be decisive as much as possible. Be the leader when needed. The more you waste time thinking of a response you’re killing time. Pretend you’re losing money the longer you’re thinking/worrying about a decision. Don’t be headless, though, a second opinion is fine sometimes. Better to be safe than sorry!", 5, category13);
        affirmationRepository.save(affirmation55);

        Affirmation affirmation56 = new Affirmation("MAKE USE OF YOUR TODO-LIST - If a chore pops into your head, but you can’t do it now. Add it to your To-Do list on your phone. ", 5, category13);
        affirmationRepository.save(affirmation56);

        Affirmation affirmation57 = new Affirmation("LESS TIME ON YOUR PHONE – Even if you’re bored. Be content with hanging out with yourself. It’s fine sometimes, everything in moderation. Remind yourself how happy you’ve been without it. You shouldn’t be on call 24/7. Maybe best to keep your phone away from you when there’s guests, watching tv and even when you’re relaxing!", 5, category13);
        affirmationRepository.save(affirmation57);

        Affirmation affirmation58 = new Affirmation("INHALE TWICE – to feel better if you’re stressed.", 5, category13);
        affirmationRepository.save(affirmation58);

        Affirmation affirmation59 = new Affirmation("DELETE APPS ON YOUR PHONE. CHECK THEM BRIEFLY AT NIGHT – they’re making you feel like shit during the day. Why waste your time on them? Think back to how good you felt when you set time aside for it instead of being on call the full day.", 5, category14);
        affirmationRepository.save(affirmation59);

        Affirmation affirmation60 = new Affirmation("YOU’RE NOT MISSING OUT – There’s always going to be night outs and holidays. You don’t need to go to them all!", 5, category15);
        affirmationRepository.save(affirmation60);

        Affirmation affirmation61 = new Affirmation("EMBRACE SADNESS – You’re not a robot and it might help. Speak to your loved ones if you need to. But in a grown-up manner don’t be a dementor. Think of the movie, Inside Out.", 5, category16);
        affirmationRepository.save(affirmation61);

        Affirmation affirmation62 = new Affirmation("HOLISTIC APPROACH AGAIN – Are you going to be down about this forever? Can you be happy again?", 5, category16);
        affirmationRepository.save(affirmation62);

        Affirmation affirmation63 = new Affirmation("VALUE WHAT YOU HAVE - your family, friends, lovely house, etc… You have an amazing life!", 5, category16);
        affirmationRepository.save(affirmation63);




        Forum forum1 = new Forum("I've been using affirmations for a while now, and I can honestly say that they've helped me to build more confidence and positivity in my life. It takes some time and effort to make them a habit, but it's definitely worth it!", 3);
        forumRepository.save(forum1);

        Forum forum2 = new Forum("I've found that using gratitude affirmations has helped me to focus more on the positive things in my life and appreciate them more. It's amazing how much of a difference it can make in your mood and outlook!", 4);
        forumRepository.save(forum2);

        Forum forum3 = new Forum("I've tried using affirmations before, but they didn't really work for me. I think it's important to find affirmations that really resonate with you and your beliefs, and to use them consistently with positive action towards your goals.", 5);
        forumRepository.save(forum3);

        Forum forum4 = new Forum("I think affirmations are a great tool for building a positive mindset, but they're not a magic solution. It's important to also take action towards your goals and work on improving yourself and your situation.", 5);
        forumRepository.save(forum4);

        Forum forum5 = new Forum("I've never really tried affirmations before, but I'm open to giving them a try. I think it's important to have a positive mindset and belief in oneself, so I'm curious to see if affirmations can help me with that.", 2);
        forumRepository.save(forum5);

        Forum forum6 = new Forum("I've been using affirmations for my health and well-being, and I've noticed a significant improvement in my overall mood and energy. It's amazing how powerful the mind-body connection can be!", 1);
        forumRepository.save(forum6);


        affirmation1.addForum(forum1);
        affirmation1.addForum(forum2);
        affirmationRepository.save(affirmation1);

        forum2.addAffirmation(affirmation2);
        forumRepository.save(forum2);

        forum3.addAffirmation(affirmation3);
        forum3.addAffirmation(affirmation4);
        forumRepository.save(forum3);

        forum4.addAffirmation(affirmation3);
        forum3.addAffirmation(affirmation1);
        forumRepository.save(forum4);

        affirmation6.addForum(forum5);
        affirmation6.addForum(forum6);
        affirmationRepository.save(affirmation6);

        forum5.addAffirmation(affirmation5);
        forumRepository.save(forum5);

        forum6.addAffirmation(affirmation7);
        forumRepository.save(forum6);

    }
}
