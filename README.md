# Application Design
(French version below)

This project aims to reproduce a Figma design of a watch store application provided by the teacher.
I have chosen this design among the 4 proposed as it was one that allowed me to play with interactivity and create different pages and I liked the clean design.
I decided to use XML on Android Studio for this project as it seemed like the easiest option. It seemed easier as it resembles html in its structure and I had a previous experience with html.
For the pages I decided to keep the font and size fonts fixed regardless of the screen size in order to stick to the original design's characteristics.
In order to have a neat program, every string is defined in the string folder and every shape and image created are located in the same drawable folder. The exact fonts have been imported and are located in the fonts folder.
The different layout xml files are in the layout folder. And the kotlin files used for interactive purposes are in the "java/com/example/appdesignrepro" folder.
The elements have been constrained according to percentages in order for the layout to adapt to the screen size.
The colors have been respected using the exact hexa code found on the original Figma design. In order to see each white rectangle better, a shadow has been added using the elevation.

![image](https://github.com/melosamsam/App_Design_Project_1/assets/103419843/e0a28b5c-23a9-4924-b5ae-fba040e7f48d)

The project is interactive, you can click on a watch model and obtain the specifics :
The white rectangles on the main page are ImageButton so you can access the other pages.

![image](https://github.com/melosamsam/App_Design_Project_1/assets/103419843/58fdf224-1842-4bfd-a627-ef6e2f1e0faf)

The back arrow also works, in case this watch isn't for you, just go back to the main menu using the arrow and select another watch :

![image](https://github.com/melosamsam/App_Design_Project_1/assets/103419843/672a03a9-31b2-4fa9-a497-8a16baaf2cb8)

Every pages has been personalized for each watch, creating a description.
The "Add to cart" buttons have been colored using a gradient to best reproduce the original design.


## Version Française

Ce projet a pour but de reproduire un design Figma proposé par le professeur.
J'ai choisi ce design parmi ceux proposés car il me permettait de jouer avec l'interactivité de plusieurs pages et j'aimais son design épuré.
J'ai décidé d'utiliser XML sur Android Studio pour ce projet car cela me semblait la solution la plus simple. La structure d'XML étant semblable à celle de html avec lequel j'ai déjà de l'expérience, cette solution semblait plus efficace.
Pour les différentes pages, j'ai choisi de conservé la police et taille de police exact donné dans le design Figma original afin de coller le plus possible à ce design original, même si ceux-ci ne s'adapteront donc pas aux différentes tailles d'écran. J'ai cependant fait le choix de contraindre les différents éléments des pages en utilisant des pourcentages pour que le layout s'adapte à la taille de l'écran. 
Afin d'avoir un programme bien organisé et clean, chacun des strings a été défini dans le dossier string et chaque forme et image se trouve dans le dossier drawable. Les polices exacts ont été importés et sont situés dans le dossier fonts. On peut trouver les fichiers xml dans le dossier layout et les fichiers kotlin utilisés pour l'intéractivité dans le dossier "java/com/example/appdesignrepro"
Les couleurs ont été respectée en utilisant le code hexa exact provenant du design Figma. Afin de mieux voir les rectangles blancs, une ombre a été créé en jouant avec l'élévation.

![image](https://github.com/melosamsam/App_Design_Project_1/assets/103419843/e0a28b5c-23a9-4924-b5ae-fba040e7f48d)

Ce projet est intéractif, on peut cliquer sur un modèle afin d'obtenir les caractéristiques de la montre.
Les rectangles blancs sont des ImageButton, ce sont eux que l'on clique afin d'atteindre les pages des spécificités.

![image](https://github.com/melosamsam/App_Design_Project_1/assets/103419843/58fdf224-1842-4bfd-a627-ef6e2f1e0faf)

La flèche de retour de chacune des pages de caractéristiques fonctionne. Donc si un modèle ne vous convient pas, pas d'inquiétude ! Il suffit d'utiliser cette flèche et retourner au menu principal. On peut alors choisir un autre modèle. 

![image](https://github.com/melosamsam/App_Design_Project_1/assets/103419843/672a03a9-31b2-4fa9-a497-8a16baaf2cb8)

Chacune des pages de caractéristiques contient une description personnalisée à chaque montre.
Les boutons "Add to cart" ont été coloré en utilisant un gradient afin de reproduire au mieux le design original.



