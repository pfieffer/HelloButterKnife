# HelloButterKnife
> Hello world kind of app for [Butter Knife](http://jakewharton.github.io/butterknife/).

Intro text from the [Github Repository](https://github.com/JakeWharton/butterknife):
> Field and method binding for Android views which uses annotation processing to generate boilerplate code for you.


## Setup
In your `app/build.gradle` put the following two lines
```
compile 'com.jakewharton:butterknife:8.8.1'  
annotationProcessor 'com.jakewharton:butterknife-compiler:8.8.1'
```

`8.8.1`is the latest at the time I am writing this. But do checkout the [official butter knife github resposity](https://github.com/JakeWharton/butterknife) to find out the latest version.

And that's it, you can then use `@BindView` `@BindString` `@onClick` among many useful annotations provided in the  **Butter Knife** library.

## Test this app

1.  Download zip **or** Clone this repository:  Type  `git clone ` or `git clone `
2. Open the project in your Android Studio(3.0.+ and gradle 4.+ recommended). Build and Run.

#### But what does the app do?
It greets you with the appropriate greeting based on the time of the day when you hit `Auto Greet` button.
It let you use your custom greeting when you hit `Use Custom Greeting` button.

*Preety useful stuff huh? The purpose of the app was to demonstrate the use of ButterKnife Library, that's all*

## Screenshots: 
| Default Greeting | Notice the time on the Top right corner! | Custom Greeting,turn my french ON!! | Past 12 in the night. Woah!......I am pathetic!!  |            
|--|--|--|--|--|
| [![Screenshot_20180228-235829.jpg](https://s18.postimg.org/uiclsk9s9/Screenshot_20180228-235829.jpg)](https://postimg.org/image/7tneszsed/) | [![Screenshot_20180228-235836.jpg](https://s18.postimg.org/v7ve4xi1l/Screenshot_20180228-235836.jpg)](https://postimg.org/image/dhtpjw4gl/) | [![Screenshot_20180228-235905.jpg](https://s18.postimg.org/vxe6hay0p/Screenshot_20180228-235905.jpg)](https://postimg.org/image/5cbnlqvn9/) | [![Screenshot_20180301-002027.jpg](https://s18.postimg.org/f9moesvjd/Screenshot_20180301-002027.jpg)](https://postimg.org/image/vkmsb4811/) |

 

