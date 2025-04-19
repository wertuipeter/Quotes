import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class main {

   static String[] quotes = {
       "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
       "In the middle of every difficulty lies opportunity. - Albert Einstein",
       "Be yourself; everyone else is already taken. - Oscar Wilde",
       "Do or do not. There is no try. - Yoda",
       "It always seems impossible until it is done. - Nelson Mandela",
       "Dream big. Start small. Act now. - Robin Sharma",
       "The only way to do great work is to love what you do. - Steve Jobs",
       "What we know is a drop, what we don't know is an ocean. - Isaac Newton",
       "Stay hungry, stay foolish. - Steve Jobs",
       "Don't count the days, make the days count. - Muhammad Ali",
       "Courage doesn't always roar. Sometimes courage is the quiet voice at the end of the day saying, 'I will try again tomorrow.' - Mary Anne Radmacher",
       "You miss 100% of the shots you don't take. - Wayne Gretzky",
       "Hustle in silence and let your success make the noise. - Unknown",
       "Simplicity is the ultimate sophistication. - Leonardo da Vinci",
       "The people who are crazy enough to think they can change the world are the ones who do. - Rob Siltanen",
       "Fall seven times, stand up eight. - Japanese Proverb",
       "Don't let yesterday take up too much of today. - Will Rogers",
       "Be the change that you wish to see in the world. - Mahatma Gandhi",
       "The harder you work for something, the greater you'll feel when you achieve it. - Unknown",
       "I am not a product of my circumstances. I am a product of my decisions. - Stephen R. Covey",
       "Life is about making an impact, not making an income. - Kevin Kruse",
       "Whatever the mind of man can conceive and believe, it can achieve. - Napoleon Hill",
       "Strive not to be a success, but rather to be of value. - Albert Einstein",
       "Two roads diverged in a wood, and I took the one less traveled by, and that has made all the difference. - Robert Frost",
       "I attribute my success to this: I never gave or took any excuse. - Florence Nightingale",
       "You miss 100% of the shots you don't take. - Wayne Gretzky",
       "I've missed more than 9000 shots in my career. I've lost almost 300 games. 26 times, I've been trusted to take the game-winning shot and missed. I've failed over and over and over again in my life. And that is why I succeed. - Michael Jordan",
       "The most difficult thing is the decision to act, the rest is merely tenacity. - Amelia Earhart",
       "Every strike brings me closer to the next home run. - Babe Ruth",
       "Definiteness of purpose is the starting point of all achievement. - W. Clement Stone",
       "We must balance conspicuous consumption with conscious capitalism. - Kevin Kruse",
       "Life is what happens to you while you're busy making other plans. - John Lennon",
       "We become what we think about. - Earl Nightingale",
       "Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do. - Mark Twain",
       "Life is 10% what happens to me and 90% of how I react to it. - Charles Swindoll",
       "The most common way people give up their power is by thinking they don't have any. - Alice Walker",
       "The mind is everything. What you think you become. - Buddha",
       "The best time to plant a tree was 20 years ago. The second best time is now. - Chinese Proverb",
       "An unexamined life is not worth living. - Socrates",
       "Eighty percent of success is showing up. - Woody Allen",
       "Your time is limited, so don't waste it living someone else's life. - Steve Jobs",
       "Winning isn't everything, but wanting to win is. - Vince Lombardi",
       "I am not a product of my circumstances. I am a product of my decisions. - Stephen Covey",
       "Every child is an artist. The problem is how to remain an artist once he grows up. - Pablo Picasso",
       "You can never cross the ocean until you have the courage to lose sight of the shore. - Christopher Columbus",
       "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel. - Maya Angelou",
       "Either you run the day, or the day runs you. - Jim Rohn",
       "Whether you think you can or you think you can't, you're right. - Henry Ford",
       "The two most important days in your life are the day you are born and the day you find out why. - Mark Twain",
       "Whatever you can do, or dream you can, begin it. Boldness has genius, power and magic in it. - Johann Wolfgang von Goethe",
       "The best revenge is massive success. - Frank Sinatra",
       "People often say that motivation doesn't last. Well, neither does bathing. That's why we recommend it daily. - Zig Ziglar",
       "Life shrinks or expands in proportion to one's courage. - Anais Nin",
       "If you hear a voice within you say 'you cannot paint,' then by all means paint and that voice will be silenced. - Vincent Van Gogh",
       "There is only one way to avoid criticism: do nothing, say nothing, and be nothing. - Aristotle",
       "Ask and it will be given to you; search, and you will find; knock and the door will be opened for you. - Jesus",
       "The only person you are destined to become is the person you decide to be. - Ralph Waldo Emerson",
       "Go confidently in the direction of your dreams. Live the life you have imagined. - Henry David Thoreau",
       "When I stand before God at the end of my life, I would hope that I would not have a single bit of talent left, and could say, 'I used everything you gave me.' - Erma Bombeck",
       "Few things can help an individual more than to place responsibility on him, and to let him know that you trust him. - Booker T. Washington",
       "Certain things catch your eye, but pursue only those that capture the heart. - Ancient Indian Proverb",
       "Believe you can and you're halfway there. - Theodore Roosevelt",
       "Everything you've ever wanted is on the other side of fear. - George Addair",
       "We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light. - Plato",
       "Teach thy tongue to say, 'I do not know,' and thou shalt progress. - Maimonides",
       "Start where you are. Use what you have. Do what you can. - Arthur Ashe",
       "When I was 5 years old, my mother always told me that happiness was the key to life. When I went to school, they asked me what I wanted to be when I grew up. I wrote down 'happy.' They told me I didn't understand the assignment, and I told them they didn't understand life. - John Lennon",
       "Fall seven times and stand up eight. - Japanese Proverb",
       "When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us. - Helen Keller",
       "Everything has beauty, but not everyone can see. - Confucius",
       "How wonderful it is that nobody need wait a single moment before starting to improve the world. - Anne Frank",
       "When I let go of what I am, I become what I might be. - Lao Tzu",
       "Life is not measured by the number of breaths we take, but by the moments that take our breath away. - Maya Angelou",
       "Happiness is not something readymade. It comes from your own actions. - Dalai Lama",
       "If you're offered a seat on a rocket ship, don't ask what seat! Just get on. - Sheryl Sandberg",
       "First, have a definite, clear practical ideal; a goal, an objective. Second, have the necessary means to achieve your ends; wisdom, money, materials, and methods. Third, adjust all your means to that end. - Aristotle",
       "If the wind will not serve, take to the oars. - Latin Proverb",
       "You can't fall if you don't climb. But there's no joy in living your whole life on the ground. - Unknown"
   };

   public static void main(String[] args) {
      JFrame frame = new JFrame("Quotes");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600, 200);
   
      JTextArea quoteArea = new JTextArea("Click the button to get inspired!");
      quoteArea.setWrapStyleWord(true);
      quoteArea.setLineWrap(true);
      quoteArea.setEditable(false);
      quoteArea.setFont(new Font("Serif", Font.PLAIN, 16));
   
      JScrollPane scrollPane = new JScrollPane(quoteArea);
      
      JButton button = new JButton("Generate Quote");
   
      button.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Random random = new Random();
               int index = random.nextInt(quotes.length);
               quoteArea.setText(quotes[index]);
            }
         });
   
      frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
      frame.getContentPane().add(button, BorderLayout.SOUTH);
      frame.setVisible(true);
   }
}