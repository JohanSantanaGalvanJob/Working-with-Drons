# Working-with-Drons
Java project made in my programming subject which consists on creating 100 drons that draw a chosen area in a SVG file that cannot be overlapped with another dron.

## Java classes Explained

The primary objective of this project is to create a dron cloud and not to overlap each other. The, it will export the images of those drons into a SVG file in order to see if they are not overlapping.

The main class has a do while sequence on which if the method of overlapping that corresponds to the Dron class is false, it will add it into the ArrayList of drons and then, it will sum the area of the previous dron into the new one.
The rest of the code consists on various system.out that gets values and the calling of a method. Taking this into consideration, is important to say that there is a method called random that generates a random number between the limit that you pass as a parameter in the method. The other function is called SVG and it generates a SVG file with all of the dron content.

As for the dron class, we have all of the attributes, and in the constructor it calculates all of the vertices and the length and the width of the rectangles. There is a method that returns the area calculated, and we have also the isOverlapped boolean method that separates the rectangle into four cuadrants (taking in count the centre of the first rectangle compared to the new one) and then it decides if it overlaped or comparing the contraries vertices of the rectangle. 

Finally, we have the getters of every attribute.

## Some examples of the execution

![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-Drons/blob/master/readme_images/1.PNG)
![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-Drons/blob/master/readme_images/2.PNG)

## Sequence Diagram

![Image text](https://github.com/JohanSantanaGalvanJob/Working-with-Drons/blob/master/readme_images/diagrama.PNG)


