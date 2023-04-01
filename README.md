# Team Seg Fault: Calculating Beach Pollution Levels using Drone Images and AI

## Project Description
Our project aims to calculate the density levels of beach pollution using drone imagery and artificial intelligence. By identifying polluted beaches, we can help organizations and governments allocate their resources more effectively and work towards maintaining cleaner beaches. Additionally, our solution can help scientists identify trends and develop better strategies for mitigating pollution.

## Impact on Climate Change
Beach pollution poses a significant threat to marine life and ecosystems, and public health. Approximately 8 million metric tons of plastic waste enter the oceans every year. This pollution has severe consequences for marine life, with an estimated 100,000 marine mammals and turtles, and 1 million seabirds dying from plastic ingestion or entanglement annually. Also, an estimated 3.5 million Americans get sick each year from being in contact with sewage in ocean water. Being in contact with these bacteria, fertilizers, and other types of waste can cause a range of illnesses, and may even pose a risk of death to some.

By providing a tool that calculates pollution density levels, we can directly contribute to the efforts in combating climate change and preserving marine ecosystems by identifying beaches that most crucially need cleaning. Cleaner beaches also help reduce the amount of greenhouse gases emitted from decaying organic matter.

## Technical Approach
Our solution involves using an autonomous drone to fly over beaches and capture images of the area. These images are then processed using computer vision algorithms and artificial intelligence to determine the density of pollution. Drones provide several advantages over other solutions:

1. Autonomy: Drones can be programmed to follow a predefined path, enabling efficient data collection without constant human supervision.
2. Flexibility: The altitude at which drones operate can be easily adjusted, allowing for the capture of images at varying resolutions.
3. Environmentally friendly: Drones are electric, reducing the carbon footprint of our solution.

Please see the included simulation to better visualize the method of capturing image data from drones.

## Instructions

Our website is hosted [here](https://dronebeachpollutiondensity.web.app/), where you can see a visualzation of our data, how our drone will naviagate the beach, and the AI model we used to calcualte the pollution data.

For the TACO model: reference README in TACO_Model directory for dataset download and model training.

## Google Products Used

Google maps location plotting API to show the results of the pollution density calculation.

The TACO model utilizes TensorFlow to classify image data.

We also used Firebase to host our website

## Ciatations

[Ploting CSV data on Google Maps](https://www.google.com/earth/outreach/learn/visualize-your-data-on-a-custom-map-using-google-my-maps/) 

[TACO Dataset Website](http://tacodataset.org/) 

[TACO Mask R-CNN Classification Model](https://github.com/pedropro/TACO) 
