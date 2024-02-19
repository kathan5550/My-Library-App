package com.example.mylibraryapp;

import java.util.ArrayList;

public class Utils {

    private static Utils instance;
    private static ArrayList<Book> allbooks;
    private static ArrayList<Book> alreadyReadbooks;
    private static ArrayList<Book> wantToReadbooks;
    private static ArrayList<Book> cureentlyReadingBooks;
    private static ArrayList<Book> Favouritebooks;


    public Utils() {
        if(null == allbooks)
        {
            allbooks = new ArrayList<>();
            initdata();
        }

        if(null == alreadyReadbooks)
        {
            alreadyReadbooks = new ArrayList<>();
        }

        if(null == wantToReadbooks)
        {
          wantToReadbooks = new ArrayList<>();
        }

        if(null == cureentlyReadingBooks)
        {
           cureentlyReadingBooks = new ArrayList<>();
        }

        if(null == Favouritebooks)
        {
          Favouritebooks = new ArrayList<>();
        }

    }

    private void initdata() {


        allbooks.add(new Book(1,"Rich Dad Poor Dad","Robert T. Kiyosaki",336,"https://m.media-amazon.com/images/I/81bsw6fnUiL.jpg","The importance of financial literacy","Rich Dad Poor Dad is written in the style of a set of parables, ostensibly based on Kiyosaki's life.The titular rich dad is his friend's father who accumulated wealth due to entrepreneurship and savvy investing, while the poor dad is claimed to be Kiyosaki's own father who he says worked hard all his life but never obtained financial security.\n\nNo one has ever proven that Rich Dad, the man who supposedly gave Kiyosaki all his advice for wealthy living, ever existed. Nor has anyone ever documented any vast reserves of wealth earned by Kiyosaki prior to the publication of Rich Dad Poor Dad in 1997.\n\nPublishing success:\nThe book was originally self-published in 1997 before being picked up commercially to become a New York Times bestseller. It has since sold over 32 million copies and become a household name.In his audio-book Choose to be Rich, Kiyosaki said that every publisher turned him down, and Barnes & Noble refused to stock the book initially. He places his focus upon talk shows and radio show appearances, of which The Oprah Winfrey Show had the biggest influence on book sales.In April 2017 a 20th Anniversary edition was published and in a preface to this 20th Anniversary edition Kiyosaki asserts that an estimated 40 million copies of the book had been sold globally","https://en.wikipedia.org/wiki/Rich_Dad_Poor_Dad"));
        allbooks.add(new Book(2,"The Psychology Of Money","Morgan Housel",478,"https://m.media-amazon.com/images/I/41r6F2LRf8L._SX323_BO1,204,203,200_.jpg","Timeless Lessons on wealth and greed","In the Psychology of Money, Morgan Housel teaches you how to have a better relationship with money and to make smarter financial decisions. Instead of pretending that humans are ROI-optimizing machines, he shows you how your psychology can work for and against you.\n\n “The challenge for us is that no amount of studying or open-mindedness can genuinely recreate the power of fear and uncertainty.”\n\nIt’s easy to have a goalpost that keeps moving. Once you achieve your goals, you look toward the next goal. And the cycle never ends. This is often driven by comparing yourself to others, and you’re often comparing yourself to someone who is above you in the ladder that you benchmark yourself against.\n\n“As I write this Warren Buffet’s net worth is $84.5 billion. Of that, $84.2 billion was accumulated after his 50th birthday. $81.5 billion came after he qualified for Social Security, in his mid-60s.”","https://www.whatyouwilllearn.com/book/the-psychology-of-money-morgan-housel/"));
        allbooks.add(new Book(3,"The Millionaire Next Door","Thomas J. Stanley and William D. Danko",258,"https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1348313018i/998.jpg","The Surprising Secrets of America's Wealthy","The authors compare the behaviour of those they call \"UAWs\" (Under Accumulators of Wealth) and those who are \"PAWs\" (Prodigious Accumulators of Wealth). Their findings, that millionaires are disproportionately clustered in middle-class and blue-collar neighborhoods and not in more affluent or white-collar communities, came as a surprise to the authors who anticipated the contrary. Stanley and Danko's book explains why, noting that high-income white-collar professionals are more likely to devote their income to luxury goods or status items, thus neglecting savings and investments.\n\nA Prodigious Accumulator of Wealth (PAW) is the reciprocal of the more common UAW, accumulating usually well over one tenth of the product of the individual's age and their realized pretax income.The authors define an Average Accumulator of Wealth (AAW) as having a net worth equal to one-tenth their age multiplied by their current annual income from all sources.\n\nMost of the millionaire households that they profiled did not have the extravagant lifestyles that most people would assume. This finding is backed up by surveys indicating how little these millionaire households have spent on such things as cars, watches, clothing, and other luxury products/services. Most importantly, the book gives a list of reasons for why these people managed to accumulate so much wealth (the top one being that \"They live below their means\"). The authors make a distinction between the 'Balance Sheet Affluent' (those with actual wealth, or high-net-worth) and the 'Income Affluent' (those with a high income, but little actual wealth, or low net-worth).","https://en.wikipedia.org/wiki/The_Millionaire_Next_Door"));
        allbooks.add(new Book(4,"Zero to One","Peter Thiel",224,"https://m.media-amazon.com/images/I/71Xygne8+qL.jpg","Notes on Startups, or How to Build the Future","Zero to One is a 2014 book by the American entrepreneur and investor Peter Thiel co-written with Blake Masters. It is a condensed and updated version of a highly popular set of online notes taken by Masters for the CS183 class on startups, as taught by Thiel at Stanford University in Spring 2012.\n\nIn The Atlantic, Derek Thomson describes Thiel's book as possibly the best business book he has ever read. In his review article, he wrote: \"Peter Thiel's new book, Zero to One, shines like a laser beam. Yes, this is a self-help book for entrepreneurs, bursting with bromides and sunny confidence about the future that only start-ups can build. But much more than that, it's also a lucid and profound articulation of capitalism and success in the 21st century economy\" and \"it's surprising in a wonderful way just how simple Zero to One feels. Barely 200 pages long, and well lit by clear prose and pithy aphorisms, Thiel has written a perfectly tweetable treatise and a relentlessly thought-provoking handbook.","https://en.wikipedia.org/wiki/Zero_to_One"));
        allbooks.add(new Book(5,"Can't Hurt Me","David Goggins",200,"https://m.media-amazon.com/images/I/81gTRv2HXrL.jpg","Master Your Mind and Defy the Odds","For David Goggins, childhood was a nightmare - poverty, prejudice, and physical abuse colored his days and haunted his nights. But through self-discipline, mental toughness, and hard work, Goggins transformed himself from a depressed, overweight young man with no future into a U.S. Armed Forces icon and one of the world's top endurance athletes. The only man in history to complete elite training as a Navy SEAL, Army Ranger, and Air Force Tactical Air Controller, he went on to set records in numerous endurance events, inspiring Outside magazine to name him The Fittest (Real) Man in America.\n\nIn Can't Hurt Me, he shares his astonishing life story and reveals that most of us tap into only 40% of our capabilities. Goggins calls this The 40% Rule, and his story illuminates a path that anyone can follow to push past pain, demolish fear, and reach their full potential.","https://www.google.ca/books/edition/Can_t_Hurt_Me/OSchEAAAQBAJ?hl=en&gbpv=0&kptab=overview"));
        allbooks.add(new Book(6,"High Output Management","Andrew S. Grove",272,"https://m.media-amazon.com/images/I/91j9DLZhD6L.jpg","How To Build And Run a Company","In this legendary business book and Silicon Valley staple, the former chairman and CEO of Intel shares his perspective on how to build and run a company. A practical handbook for navigating real-life business scenarios and a powerful management manifesto with the ability to revolutionize the way we work.\n\nThe essential skill of creating and maintaining new businesses—the art of the entrepreneur—can be summed up in a single word: managing. Born of Grove’s experiences at one of America’s leading technology companies (as CEO and employee number three at Intel), High Output Management is equally appropriate for sales managers, accountants, consultants, and teachers, as well as CEOs and startup founders. Grove covers techniques for creating highly productive teams, demonstrating methods of motivation that lead to peak performance.","https://www.google.ca/books/edition/High_Output_Management/piCeCgAAQBAJ?hl=en&gbpv=0"));
        allbooks.add(new Book(7,"Deep Work","Cal Newport",288,"https://m.media-amazon.com/images/I/71yA4+MC46L.jpg","Rules for Focused Success in a Distracted World","Master one of our economy’s most rare skills and achieve groundbreaking results with this “exciting” book (Daniel H. Pink) from an “exceptional” author (New York Times Book Review).\n\nDeep work is the ability to focus without distraction on a cognitively demanding task. It's a skill that allows you to quickly master complicated information and produce better results in less time. Deep Work will make you better at what you do and provide the sense of true fulfillment that comes from craftsmanship. In short, deep work is like a super power in our increasingly competitive twenty-first century economy. And yet, most people have lost the ability to go deep-spending their days instead in a frantic blur of e-mail and social media, not even realizing there's a better way.\n\nIn Deep Work, author and professor Cal Newport flips the narrative on impact in a connected age. Instead of arguing distraction is bad, he instead celebrates the power of its opposite. Dividing this book into two parts, he first makes the case that in almost any profession, cultivating a deep work ethic will produce massive benefits. He then presents a rigorous training regimen, presented as a series of four \"rules,\" for transforming your mind and habits to support this skill.\n\n1. Work Deeply\n2. Embrace Boredom\n3. Quit Social Media\n4. Drain the Shallows","https://www.google.ca/books/edition/Deep_Work/4QTzCAAAQBAJ?hl=en&gbpv=0"));
        allbooks.add(new Book(8,"The Productivity Project","Chris Bailey",304,"https://m.media-amazon.com/images/I/51Pi1JKgDpL.jpg","Accomplishing More by Managing Your Time, Attention, and Energy","A fresh, personal, and entertaining exploration of a topic that concerns all of us: how to be more productive at work and in every facet of our lives.\n\nChris Bailey turned down lucrative job offers to pursue a lifelong dream—to spend a year performing a deep dive experiment into the pursuit of productivity, a subject he had been enamored with since he was a teenager. After obtaining his business degree, he created a blog to chronicle a year-long series of productivity experiments he conducted on himself, where he also continued his research and interviews with some of the world’s foremost experts, from Charles Duhigg to David Allen. Among the experiments that he tackled: Bailey went several weeks with getting by on little to no sleep; he cut out caffeine and sugar; he lived in total isolation for 10 days; he used his smartphone for just an hour a day for three months; he gained ten pounds of muscle mass; he stretched his work week to 90 hours; a late riser, he got up at 5:30 every morning for three months—all the while monitoring the impact of his experiments on the quality and quantity of his work\n\nThe Productivity Project—and the lessons Chris learned are the result of that year-long journey. Among the counterintuitive insights Chris Bailey will teach you:\n·   slowing down to work more deliberately\n·   shrinking or eliminating the unimportant\n.   the rule of three\n.   striving for imperfection\n.    cheduling less time for important tasks\n.   and the concept of productive procrastination","https://www.google.ca/books/edition/The_Productivity_Project/B3RpCgAAQBAJ?hl=en&gbpv=0"));
        allbooks.add(new Book(9,"The 4-Hour Workweek","Tim Ferriss",308,"https://m.media-amazon.com/images/I/81qW97ndkvL.jpg","Escape 9-5, Live Anywhere, and Join the New Rich","The 4-Hour Workweek is a self-help book by Timothy Ferriss, an American writer, educational activist, and entrepreneur.It deals with what Ferriss refers to as \"lifestyle design\", and repudiates the traditional \"deferred\" life plan in which people work grueling hours and take few vacations for decades and save money in order to relax after retirement. The book spent four years on The New York Times Best Seller List, was translated into 40 languages, and sold around 2.1 million copies.\n\nBackground:\n\nFerriss developed the ideas present in The 4-Hour Workweek (4HWW) while working 14-hour days at his sports nutrition supplement company, BrainQUICKEN.Frustrated by the overwork and lack of free time, Ferriss took a 3-week sabbatical to Europe. During that time and continued travels throughout Europe, Asia, and South America, Ferriss developed a streamlined system of checking email once per day and outsourcing small daily tasks to virtual assistants.His personal escape from a workaholic lifestyle was the genesis of the book.\n\nThe format of The 4-Hour Workweek took shape during a series of lectures Ferriss delivered on high-tech entrepreneurship at Princeton University, his alma mater.The lectures (and book) described Ferriss' own experiences in company automation and lifestyle development.","https://www.google.ca/books/edition/The_4_Hour_Work_Week/E3HVzZQh88wC?hl=en&gbpv=0"));
        allbooks.add(new Book(10,"Extreme Ownership","Jocko Willink, Leif Babin",320,"https://m.media-amazon.com/images/I/71GqMTCFWtL.jpg","How U.S. Navy SEALs Lead and Win","An updated edition of the blockbuster bestselling leadership book that took America and the world by storm, two U.S. Navy SEAL officers who led the most highly decorated special operations unit of the Iraq War demonstrate how to apply powerful leadership principles from the battlefield to business and life.\n\nSent to the most violent battlefield in Iraq, Jocko Willink and Leif Babin’s SEAL task unit faced a seemingly impossible mission: help U.S. forces secure Ramadi, a city deemed “all but lost.” In gripping firsthand accounts of heroism, tragic loss, and hard-won victories in SEAL Team Three’s Task Unit Bruiser, they learned that leadership—at every level—is the most important factor in whether a team succeeds or fails.\n\nWillink and Babin returned home from deployment and instituted SEAL leadership training that helped forge the next generation of SEAL leaders. After departing the SEAL Teams, they launched Echelon Front, a company that teaches these same leadership principles to businesses and organizations. From promising startups to Fortune 500 companies, Babin and Willink have helped scores of clients across a broad range of industries build their own high-performance teams and dominate their battlefields.\n\nNow, detailing the mind-set and principles that enable SEAL units to accomplish the most difficult missions in combat, Extreme Ownership shows how to apply them to any team, family or organization. Each chapter focuses on a specific topic such as Cover and Move, Decentralized Command, and Leading Up the Chain, explaining what they are, why they are important, and how to implement them in any leadership environment.","https://www.google.ca/books/edition/Extreme_Ownership/tpspDwAAQBAJ?hl=en&gbpv=0"));
        allbooks.add(new Book(11,"The Compound Effect","Darren Hardy",176,"https://m.media-amazon.com/images/I/41AP23Iy8GL._SX359_BO1,204,203,200_.jpg","A distillation of the fundamental principles","The New York Times and Wall Street Journal bestseller, based on the principle that little, everyday decisions will either take you to the life you desire or to disaster by default.\n\nNo gimmicks. No Hyperbole. No Magic Bullet. The Compound Effect is a distillation of the fundamental principles that have guided the most phenomenal achievements in business, relationships, and beyond. This easy-to-use, step-by-step operating system allows you to multiply your success, chart your progress, and achieve any desire. If you're serious about living an extraordinary life, use the power of The Compound Effect to create the success you want. You will find strategies including:\nHow to win--every time! The No. 1 strategy to achieve any goal and triumph over any competitor, even if they're smarter, more talented or more experienced.Eradicating your bad habits (some you might be unaware of!) that are derailing your progress.The real, lasting keys to motivation--how to get yourself to do things you don't feel like doing.Capturing the elusive, awesome force of momentum. Catch this, and you'll be unstoppable.The acceleration secrets of superachievers. Do they have an unfair advantage? Yes they do, and now you can too!","https://www.google.ca/books/edition/The_Compound_Effect/P28DsLkv5cgC?hl=en&gbpv=0"));
        allbooks.add(new Book(12,"Trillion Dollar Coach","Eric Schmidt, Jonathan Rosenberg",240,"https://m.media-amazon.com/images/I/91wYBAJUmzL.jpg","The Leadership Playbook of Silicon Valley's Bill Campbell","The team behind How Google Works returns with management lessons from legendary coach and business executive, Bill Campbell, whose mentoring of some of our most successful modern entrepreneurs has helped create well over a trillion dollars in market value.\n\nBill Campbell played an instrumental role in the growth of several prominent companies, such as Google, Apple, and Intuit, fostering deep relationships with Silicon Valley visionaries, including Steve Jobs, Larry Page, and Eric Schmidt. In addition, this business genius mentored dozens of other important leaders on both coasts, from entrepreneurs to venture capitalists to educators to football players, leaving behind a legacy of growing companies, successful people, respect, friendship, and love after his death in 2016.\n\nLeaders at Google for over a decade, Eric Schmidt, Jonathan Rosenberg, and Alan Eagle experienced firsthand how the man fondly known as Coach Bill built trusting relationships, fostered personal growth—even in those at the pinnacle of their careers—inspired courage, and identified and resolved simmering tensions that inevitably arise in fast-moving environments. To honor their mentor and inspire and teach future generations, they have codified his wisdom in this essential guide.\n\nBased on interviews with over eighty people who knew and loved Bill Campbell, Trillion Dollar Coach explains the Coach’s principles and illustrates them with stories from the many great people and companies with which he worked. The result is a blueprint for forward-thinking business leaders and managers that will help them create higher performing and faster moving cultures, teams, and companies.","https://www.google.ca/books/edition/Trillion_Dollar_Coach/nmdzDwAAQBAJ?hl=en&gbpv=0"));







    }


    public static Utils getInstance()
    {
        if(null!= instance)
        {
            return instance;
        }
        else
        {
            instance = new Utils();
            return instance;
        }
    }

    public static ArrayList<Book> getAllbooks() {
        return allbooks;
    }

    public static ArrayList<Book> getAlreadyReadbooks() {
        return alreadyReadbooks;
    }

    public static ArrayList<Book> getWantToReadbooks() {
        return wantToReadbooks;
    }

    public static ArrayList<Book> getCureentlyReadingBooks() {
        return cureentlyReadingBooks;
    }

    public static ArrayList<Book> getFavouritebooks() {
        return Favouritebooks;
    }

    public Book getBookbyid(int id)
    {
        for(Book b:allbooks)
        {
            if(b.getId()==id)
            {
                return b;
            }
        }
        return null;
    }

    public boolean addToAlreadyRead(Book book)
    {
        return alreadyReadbooks.add(book);
    }

    public boolean addToWantToRead(Book book)
    {
        return wantToReadbooks.add(book);
    }

    public boolean addToCurrentlyRead(Book book)
    {
        return cureentlyReadingBooks.add(book);
    }

    public boolean addTofavouriteBook(Book book)
    {
        return Favouritebooks.add(book);
    }

    public boolean removeFromAlreadyReadBook(Book book)
    {
        return alreadyReadbooks.remove(book);
    }

    public boolean removeFromWantToReadBook(Book book)
    {
        return wantToReadbooks.remove(book);
    }

    public boolean removeFromCurrentlyReadBook(Book book)
    {
        return cureentlyReadingBooks.remove(book);
    }
    public boolean removeFromFavoriteBook(Book book)
    {
        return Favouritebooks.remove(book);
    }
}
