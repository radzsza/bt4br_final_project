# Project outline
Aleksandra Radziukiewicz, Anastasiya Pautarak  

We decided on a simple video game focused on hardships of starting with R and ggplot2 as a student. The game's 
GUI is written in Java Swing (Java's built in package for GUI creation). On the other hand, the displayed plots were made with R ggplot2 and then 
incorporated into the project.

## Game plot

You are a student messaged by your lab supervisor. He sends you already prepared data and asks you to plot it for him. 
But don't worry, he also sends you a tutorial on how to make good plots. Will your skills and tools be enough to 
create good quality data visualization?

## Installing the game

Download the game.jar file and run it by either double-clicking on it or typing `java -jar game.jar`.

**Warning!**

**JRE or JDK version 24 or higher is required. If you don't have it, please download it from the https://www.oracle.com/java/technologies/downloads/?er=221886**

## Technical aspects

The game does not create the plots from scratch. It uses the ability of every component (JComponent exactly) to paint an image behind it. So all the in-game plots "created" by the user are ggplot2 
plots with pure alpha layer as a fill. It is later filled by setting a background color or background image under the plots' outline. All the `.png` files are in the `game/resources/img/` directory. 
Feel free to inspect them.

## Work distributiuon

Aleksandra Radziukiewicz:  
* coding the GUI  
* game logics implementation  
* technical description

Anastasiya Pautarak:  
* Developed data visualizations (iris dataset, TPM gene expression) using R
* Designed and implemented in-game GUI elements and narrative emails
* Contributed to tutorial content
* Edited graphics and visual interface elements to improve design and user experience
* Refactored interface components to enhance clarity and consistency
* Contributed to the Citation and Other Tools Used section

## Other Tools Used for Graphics and Email Content

* Illustrations used in the project were initially generated using ChatGPT’s image capabilities, but were heavily modified, redrawn, and finalized by Anastasiya Pautarak in Procreate to match the game’s visual style. 
* Some of the in-game emails and other written content were initially drafted by Anastasiya Pautarak and partially revised by ChatGPT, which assisted in correcting language errors and improving clarity.

## Citations

* Wickham H (2016). ggplot2: Elegant Graphics for Data Analysis. Springer-Verlag New York. ISBN 978-3-319-24277-4, https://ggplot2.tidyverse.org.
* Arnold, K, Gosling, J, & Holmes, D (2005). The Java programming language. Addison Wesley Professional.
* Java™ Platform Standard Edition 24 Development Kit - JDK™ 24 (2025) https://docs.oracle.com/en/java/javase/24/
* Idrees Hassan Monocraft font https://github.com/IdreesInc/Monocraft
* Lecture #6 Scientific Data visualization 1, Slides Lecture, https://pegaz.uj.edu.pl/course/view.php?id=683479
* Savage Interactive. (2025). Procreate https://procreate.com
* OpenAI. (2025). ChatGPT (June 3 version) [Large language and image model]. https://chat.openai.com
* RDocumentation ggplot2 package https://www.rdocumentation.org/packages/ggplot2/versions/3.5.2
* RDocumentation tidyverse package https://www.rdocumentation.org/packages/tidyverse/versions/2.0.0
