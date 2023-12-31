package com.sublime.niaclone.data.news.fake

import com.sublime.niaclone.data.news.NewsResource
import com.sublime.niaclone.data.news.VideoInfo
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toInstant

object FakeDataSource {
    val sampleResource = NewsResource(
        episode = 52,
        title = "Thanks for helping us reach 1M YouTube Subscribers",
        content = "Thank you everyone for following the Now in Android series and everything the Android Developers YouTube channel has to offer. During the Android Developer Summit, our YouTube channel reached 1 million subscribers! Here’s a small video to thank you all.",
        url = "https://youtu.be/-fJ6poHQrjM",
        authorName = "",
        publishDate = LocalDateTime(
            year = 2021,
            monthNumber = 11,
            dayOfMonth = 9,
            hour = 0,
            minute = 0,
            second = 0,
            nanosecond = 0
        ).toInstant(TimeZone.UTC),
        type = "Video \uD83D\uDCFA",
        topics = listOf(
            "Headlines",
        ),
        alternateVideo = VideoInfo(
            url = "",
            startTimestamp = 0,
            endTimestamp = 0
        )
    )

    val data = """
{
  "resources": [
    {
      "episode": 52,
      "title": "Thanks for helping us reach 1M YouTube Subscribers",
      "content": "Thank you everyone for following the Now in Android series and everything the Android Developers YouTube channel has to offer. During the Android Developer Summit, our YouTube channel reached 1 million subscribers! Here’s a small video to thank you all.",
      "URL": "https://youtu.be/-fJ6poHQrjM",
      "authorName": "",
      "publishDate": "2021-11-09T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Headlines"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Transformations and customisations in the Paging Library",
      "content": "A demonstration of different operations that can be performed with Paging. Transformations like inserting separators, when to create a new pager, and customisation options for consuming PagingData.",
      "URL": "https://youtu.be/ZARz0pjm5YM",
      "authorName": "TJ",
      "publishDate": "2021-11-01T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "MAD Skills",
        "Paging"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Community tip on Paging",
      "content": "Tips for using the Paging library from the developer community",
      "URL": "https://youtu.be/r5JgIyS3t3s",
      "authorName": "",
      "publishDate": "2021-11-08T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "MAD Skills",
        "Paging"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Paging Q&A",
      "content": "In this live session, TJ and Dustin answered your questions in the usual live Q&A format.",
      "URL": "https://youtu.be/8i6vrlbIVCc",
      "authorName": "",
      "publishDate": "2021-11-11T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "MAD Skills",
        "Paging"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Gradle series kicks off",
      "content": "Murat introduces the Gradle series and everything you'll learn in it.",
      "URL": "https://youtu.be/mk0XBWenod8",
      "authorName": "Murat",
      "publishDate": "2021-11-15T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "MAD Skills",
        "Gradle"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Intro to Gradle and AGP",
      "content": "In the first episode of the Gradle MAD Skills series, Murat explains how the Android build system works, and how to configure your build.",
      "URL": "https://youtu.be/GjPS4xDMmQY",
      "authorName": "Murat",
      "publishDate": "2021-11-15T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "MAD Skills",
        "Gradle"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "How to write a Gradle plugin",
      "content": "In this second episode of the Gradle MAD Skills series, Murat explains how to write your own custom Gradle plugin.",
      "URL": "https://youtu.be/LPzBVtwGxlo",
      "authorName": "Murat",
      "publishDate": "2021-11-22T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "MAD Skills",
        "Gradle"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Take your Gradle plugin to the next step",
      "content": "This third and last episode of the Gradle MAD Skills series teaches you how to get access to various build artifacts using the new Artifact API.",
      "URL": "https://youtu.be/SB4QlngQQW0",
      "authorName": "Murat",
      "publishDate": "2021-11-29T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "MAD Skills",
        "Gradle"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "AppCompat, Activity, and Fragment to support multiple back stacks",
      "content": "The 1.4.0 release of these libraries brings stable support for multiple back stacks.",
      "URL": "https://developer.android.com/jetpack/androidx/releases/appcompat#1.4.0",
      "authorName": "",
      "publishDate": "2021-11-17T00:00:00.000Z",
      "type": "API change",
      "topics": [
        "AndroidX",
        "Navigation"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Emoji2 adds support for modern emojis",
      "content": "The 1.0 stable release of Emoji2 allows you to use modern emojis in your app.",
      "URL": "https://developer.android.com/jetpack/androidx/releases/emoji2#1.0.0",
      "authorName": "",
      "publishDate": "2021-11-17T00:00:00.000Z",
      "type": "API change",
      "topics": [
        "AndroidX",
        "Text"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Lifecycle introduces lifecycle-aware coroutine APIs",
      "content": "The new 2.4 release of Lifecycle introduces repeatOnLifecycle and flowWithLifecycle.",
      "URL": "https://developer.android.com/jetpack/androidx/releases/lifecycle#2.4.0",
      "authorName": "",
      "publishDate": "2021-11-17T00:00:00.000Z",
      "type": "API change",
      "topics": [
        "AndroidX",
        "Lifecycle"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Paging release brings changes to LoadState",
      "content": "The new 3.1 release of Paging changes the behavior of LoadState.",
      "URL": "https://developer.android.com/jetpack/androidx/releases/paging#3.1.0",
      "authorName": "",
      "publishDate": "2021-11-17T00:00:00.000Z",
      "type": "API change",
      "topics": [
        "AndroidX",
        "Paging"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Wear tiles released as 1.0 stable",
      "content": "The library that you use to build custom tiles for Wear OS devices is now stable.",
      "URL": "https://developer.android.com/jetpack/androidx/releases/wear-tiles#1.0.0",
      "authorName": "",
      "publishDate": "2021-11-17T00:00:00.000Z",
      "type": "API change",
      "topics": [
        "AndroidX",
        "Wear"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Introducing Jetpack Media3",
      "content": "The first alpha version of this new library is now available. Media3 is a collection of support libraries for media playback, including ExoPlayer. The following article explains why the team created Media3, what it contains, and how it can simplify your app architecture.",
      "URL": "https://developer.android.com/jetpack/androidx/releases/media3",
      "authorName": "Don Turner",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "AndroidX",
        "Media"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "The problem with emojis and how emoji2 can help out",
      "content": "Meghan wrote about the new emoji2 library that just became stable.",
      "URL": "https://medium.com/androiddevelopers/support-modern-emoji-99f6dea8e57f",
      "authorName": "Meghan",
      "publishDate": "2021-11-12T00:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "AndroidX",
        "Text"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Convert YUV to RGB for CameraX Image Analysis",
      "content": "Learn about a new feature in CameraX to convert YUV, the format that CameraX produces, to RGB used for image analysis capabilities available in TensorFlow Lite, for example. Read the blog post for more information about these formats and how to use the new conversion feature.",
      "URL": "https://medium.com/androiddevelopers/convert-yuv-to-rgb-for-camerax-imageanalysis-6c627f3a0292",
      "authorName": "Kailiang Chen",
      "publishDate": "2021-11-19T00:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "AndroidX",
        "Camera"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Improving App Startup: Lessons from the Facebook App",
      "content": "Improving app startup time is not a trivial task and requires a deep understanding of things that affect it. This year, the Android team and the Facebook app team have been working together on metrics and sharing approaches to improve app startup. Read more about the findings in this blog post.",
      "URL": "https://android-developers.googleblog.com/2021/11/improving-app-startup-facebook-app.html",
      "authorName": "",
      "publishDate": "2021-11-16T00:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Performance"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "About Custom Accessibility Actions",
      "content": "The accessibility series continues on with more information on how to create custom accessibility actions to make your apps more accessible. You can provide a custom action to the accessibility services and implement logic related to the action. For more information, check out the following episode!",
      "URL": "https://youtu.be/wWDYIGk0Kdo",
      "authorName": "Shailen Tuli",
      "publishDate": "2021-11-17T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Accessibility"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "Conveying state for Accessibility",
      "content": "In this episode of the Accessibility series, you can learn more about the StateDescription API, when to use stateDescription and contentDescription, and how to represent error states to the end user.",
      "URL": "https://youtu.be/JvWM2PjLJls",
      "authorName": "Shailen Tuli",
      "publishDate": "2021-11-30T00:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Accessibility"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "New Compose for Wear OS codelab",
      "content": "In this codelab, you can learn how Wear OS can work with Compose, what Wear OS specific composables are available, and more!",
      "URL": "https://developer.android.com/codelabs/compose-for-wear-os",
      "authorName": "Jeremy Walker",
      "publishDate": "2021-10-27T23:00:00.000Z",
      "type": "Codelab",
      "topics": [
        "Compose",
        "Wear OS"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 52,
      "title": "ADB Podcast episode 179 Hosts 3, Guests 0",
      "content": "Chet, Romain and Tor sit down to chat about the Android Developer Summit, and in particular all the new features arriving in Android Studio, along with a few other topics like Chet’s new jank stats library, the Android 12L release, and more.",
      "URL": "https://adbackstage.libsyn.com/episode-178-hosts-3-guests-0",
      "authorName": "Chet Haase",
      "publishDate": "2021-11-15T00:00:00.000Z",
      "type": "Podcast 🎙",
      "topics": [
        "Android Studio",
        "ADS",
        "Performance",
        "Android 12"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Building apps which are private by design",
      "content": "Sara N-Marandi, product manager, and Yacine Rezgui, developer relations engineer, provided guidelines and best practices on how to build apps that are private by design, covered new privacy features in Android 12 and previewed upcoming Android concepts.",
      "URL": "https://youtu.be/hBVwr2ErQCw",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Privacy",
        "Security"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Memory Safety Tools",
      "content": "Serban Constantinescu, product manager, talked about the Memory Safety Tools that became available starting in Android 11 and have continued to evolve in Android 12. These tools can help address memory bugs and improve the quality and security of your application.",
      "URL": "https://youtu.be/JqLcTFpXreg",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Security",
        "Debugging",
        "App quality"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Increasing User Transparency with Privacy Dashboard",
      "content": "Android is ever evolving in its quest to protect users’ privacy. In Android 12, the platform increases transparency by introducing Privacy Dashboard, which gives users a simple and clear timeline view of the apps that have accessed location, microphone and camera within the past 24 hours. ",
      "URL": "https://medium.com/androiddevelopers/increasing-user-transparency-with-privacy-dashboard-23064f2d7ff6",
      "authorName": "Meghan Mehta",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Privacy"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "The most unusual and interesting security issues addressed last year",
      "content": "Lilian Young, software engineer, presented a selection of the most unusual, intricate, and interesting security issues addressed in the last year. Developers and researchers are able to contribute to the security of the Android platform by submitting to the Android Vulnerability Rewards Program.",
      "URL": "https://medium.com/androiddevelopers/now-in-android-50-ads-special-9934422f8dd1",
      "authorName": "Lilian Young",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Security"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "New Data Safety section in the Play Console",
      "content": "The new Data safety section will give you a simple way to showcase your app’s overall safety. It gives you a place to give users deeper insight into your app’s privacy and security practices, and explain the data your app may collect and why — all before users install.",
      "URL": "https://youtu.be/J7TM0Yy0aTQ",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Play Console",
        "Privacy",
        "Security"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Building Android UIs for any screen size",
      "content": "Clara Bayarri, engineering manager and Daniel Jacobson, product manager, talked about the state of the ecosystem, focusing on new design guidance, APIs, and tools to help you make the most of your UI on different screen sizes.",
      "URL": "https://youtu.be/ir3LztqbeRI",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Large Screens"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "What's new for large screens & foldables",
      "content": "Emilie Roberts, Chrome OS developer advocate and Andrii Kulian, Android software engineer, introduced new features focused specifically on making apps look great on large screens, foldables, and Chrome OS. ",
      "URL": "https://youtu.be/6-925K3hMHU",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Large Screens",
        "Foldables",
        "Chrome OS",
        "UI"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Enable great input support for all devices",
      "content": "Users expect seamless experiences when using keyboards, mice, and stylus. Emilie Roberts taught us how to handle common keyboard and mouse input events and how to get started with more advanced support like keyboard shortcuts, low-latency styluses, MIDI, and more.",
      "URL": "https://youtu.be/piLEZYTc_4g",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "UI"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Best practices for video apps on foldable devices",
      "content": "Francesco Romano, developer advocate, and Will Chan, product manager at Zoom explored new user experiences made possible by the foldable form factor, focusing on video conferencing and media applications. ",
      "URL": "https://youtu.be/DBAek_P0nEw",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "UI",
        "Media",
        "Foldables",
        "Camera"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Design beautiful apps on foldables and large screens",
      "content": "Liam Spradlin, design advocate, and Jonathan Koren, developer relations engineer, talked about how to design and test Android applications that look and feel great across device types and screen sizes, from tablets to foldables to Chrome OS.",
      "URL": "https://youtu.be/DJeJIJKOUbI",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "UI",
        "Material Design",
        "Foldables",
        "Large Screens"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "12L and new Android APIs and tools for large screens",
      "content": "Dave Burke, vice president of engineering, wrote a post covering the developer preview of 12L, an upcoming feature drop that makes Android 12 even better on large screens. ",
      "URL": "https://android-developers.googleblog.com/2021/10/12L-preview-large-screens.html",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Platform",
        "Large Screens",
        "Android releases"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "New features in ML Kit: Text Recognition V2 & Pose Detections",
      "content": "Zongmin Sun, software engineer, and Valentin Bazarevsky, MediaPipe Engineer, talked about Text Recognition V2 & Pose Detection, recently-released features in ML Kit. ",
      "URL": "https://youtu.be/9EKQ0UC04S8",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Machine learning"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "How to retain users with Android backup and restore",
      "content": "In this talk, Martin Millmore, engineering manager, and Ruslan Tkhakokhov, software engineer, explored the benefits of transferring users’ data to a new device, using Backup and Restore to achieve that in a simple and secure way.",
      "URL": "https://youtu.be/bg2drEhz1_s",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Platform"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Compatibility changes in Android 12",
      "content": "Developer relations engineers Kseniia Shumelchyk and Slava Panasenko talked about new Android 12 features and changes. They shared tools and techniques to ensure that apps are compatible with the next Android release and users can take advantage of new features, along with app developer success stories.",
      "URL": "https://youtu.be/fCMJmV6nqGo",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Platform"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 50,
      "title": "Building great experiences for Novice Internet Users",
      "content": "Learn the principles to help craft great experiences for the novice Internet user segment from Mrinal Sharma, UX manager, and Amrit Sanjeev, developer relations engineer. They highlight the gap between nascent and tech savvy user segments and suggest strategies in areas to improve the overall user experience. Factors like low functional literacy, being multilingual by default, being less digitally confident, and having no prior internet experience requires that we rethink the way we build apps for these users.",
      "URL": "https://youtu.be/Sf_TauUY4LE",
      "authorName": "",
      "publishDate": "2021-10-26T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "UX"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Android Basics in Kotlin course 🧑‍💻",
      "content": "Android Basics in Kotlin teaches people with no programming experience how to build simple Android apps. Since the first learning units were released in 2020, over 100,000 beginners have completed it! Today, we’re excited to share that the final unit has been released, and the full Android Basics in Kotlin course is now available.",
      "URL": "https://android-developers.googleblog.com/2021/10/announcing-android-basics-in-kotlin.html",
      "authorName": "Murat Yener",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Kotlin",
        "Courses"
      ],
      "alternateVideo": {
        "URL": "https://storage.googleapis.com/now-in-android/NIA049.mp4",
        "startTimestamp": 82,
        "endTimestamp": 97
      }
    },
    {
      "episode": 49,
      "title": "WorkManager 2.7 adds setExpedited API to help with Foreground Service restrictions",
      "content": "As the most outstanding release this time, WorkManager 2.7 was promoted to stable. This new version introduces a new setExpedited API to help with Foreground Service restrictions in Android 12.",
      "URL": "https://developer.android.com/reference/android/app/job/JobInfo.Builder#setExpedited(boolean)",
      "authorName": "",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "API change",
      "topics": [
        "WorkManager"
      ],
      "alternateVideo": {
        "URL": "https://storage.googleapis.com/now-in-android/NIA049.mp4",
        "startTimestamp": 97,
        "endTimestamp": 121
      }
    },
    {
      "episode": 49,
      "title": "Updated Widget docs",
      "content": "Widgets can make a huge impact on your user’s home screen! We updated the App Widgets documentation with the recent changes in the latest OS versions. New pages about how to create a simple widget, an advanced widget, and how to provide flexible widget layouts.",
      "URL": "https://developer.android.com/guide/topics/appwidgets",
      "authorName": "",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "Docs 📑",
      "topics": [
        "Widgets"
      ],
      "alternateVideo": {
        "URL": "https://storage.googleapis.com/now-in-android/NIA049.mp4",
        "startTimestamp": 193,
        "endTimestamp": 206
      }
    },
    {
      "episode": 49,
      "title": "Extend AGP by creating your own plugins",
      "content": "The Android Gradle Plugin (AGP) contains extension points for plugins to control build inputs and extend its functionality. Starting in version 7.0, AGP has a set of official, stable APIs that you can rely on. We also have a new documentation page that walks you through this and explains how to create your own plugins.",
      "URL": "https://developer.android.com/studio/build/extend-agp",
      "authorName": "",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "Docs 📑",
      "topics": [
        "Gradle",
        "Android Studio"
      ],
      "alternateVideo": {
        "URL": "https://storage.googleapis.com/now-in-android/NIA049.mp4",
        "startTimestamp": 206,
        "endTimestamp": 220
      }
    },
    {
      "episode": 49,
      "title": "Revamped Compose Basics Codelab",
      "content": "If you’re planning to start learning Jetpack Compose, our modern toolkit for building native Android UI, it’s your lucky day! We just revamped the Basics Jetpack Compose codelab to help you learn the core concepts of Compose, and only with this, you’ll see how much it improves building Android UIs.",
      "URL": "https://developer.android.com/codelabs/jetpack-compose-basics",
      "authorName": "",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "Codelab",
      "topics": [
        "Compose"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Start an activity for a result from a Composable",
      "content": "We expanded the Compose and other libraries page to cover how to start an activity for result, request runtime permissions, and handle the system back button directly from your composables.",
      "URL": "https://developer.android.com/jetpack/compose/libraries",
      "authorName": "",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "Docs 📑",
      "topics": [
        "Compose"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Material components in Compose",
      "content": "We added a new Material Components and layouts page that goes over the different Material components in Compose such as backdrop, app bars, modal drawers, etc.!",
      "URL": "https://developer.android.com/jetpack/compose/layouts/material",
      "authorName": "",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "Docs 📑",
      "topics": [
        "Compose",
        "Material design"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "How to implement a custom design system",
      "content": "How to implement a custom design system in Compose",
      "URL": "https://developer.android.com/jetpack/compose/themes/custom",
      "authorName": "",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "Docs 📑",
      "topics": [
        "Compose",
        "Material design"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "The anatomy of a theme",
      "content": "Understanding the anatomy of a Compose theme",
      "URL": "https://developer.android.com/jetpack/compose/themes/anatomy",
      "authorName": "",
      "publishDate": "2021-10-20T23:00:00.000Z",
      "type": "Docs 📑",
      "topics": [
        "Compose",
        "Themes"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Paging 📑  Displaying data and its loading state",
      "content": "In the third episode of the Paging video series, TJ adds a local cache to pull from and refresh only when necessary, making use of Room . The local cache acts as the single source of truth for paging data.",
      "URL": "https://www.youtube.com/watch?v=OHH_FPbrjtA",
      "authorName": "TJ Dahunsi",
      "publishDate": "2021-10-17T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Paging",
        "Room",
        "Data storage"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Data safety in the Play Console 🔒",
      "content": "Google Play is rolling out the Data safety form in the Google Play Console. With the new Data safety section, developers will now have a transparent way to show users if and how they collect, share, and protect user data, before users install an app.\nRead the blog post to learn more about how to submit your app information in Play Console, how to get prepared, and what your users will see in your app’s store listing starting February.",
      "URL": "https://android-developers.googleblog.com/2021/10/launching-data-safety-in-play-console.html",
      "authorName": "Krish Vitaldevara",
      "publishDate": "2021-10-17T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Play",
        "Privacy & Security"
      ],
      "alternateVideo": {
        "URL": "https://storage.googleapis.com/now-in-android/NIA049.mp4",
        "startTimestamp": 49,
        "endTimestamp": 82
      }
    },
    {
      "episode": 49,
      "title": "Honor every photo - How cameras capture images",
      "content": "Episode 177: Honor every photon. In this episode, Chet, Roman, and Tor have a chat with Bart Wronski from the Google Research team, discussing the camera pipeline that powers the Pixel phones. How cameras capture images, how the algorithms responsible for Pixel’s beautiful images, HDR+ or Night Sight mode works, and more!",
      "URL": "https://adbackstage.libsyn.com/episode-177-honor-every-photon",
      "authorName": "Chet Haase",
      "publishDate": "2021-10-17T23:00:00.000Z",
      "type": "Podcast 🎙",
      "topics": [
        "Camera",
        "Graphics"
      ],
      "alternateVideo": {
        "URL": "https://storage.googleapis.com/now-in-android/NIA049.mp4",
        "startTimestamp": 233,
        "endTimestamp": 287
      }
    },
    {
      "episode": 49,
      "title": "Accessibility series 🌐 - Touch targets",
      "content": "The accessibility series continues on with more information on how to follow basic accessibility principles to make sure that your app can be used by as many users as possible.\nIn general, you should ensure that interactive elements have a width and height of at least 48dp! In the touch targets episode, you’ll learn about a few ways in which you can make this happen.",
      "URL": "https://www.youtube.com/watch?v=Dqqbe8IFBA4",
      "authorName": "Shailen Tuli",
      "publishDate": "2021-10-16T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Accessibility"
      ],
      "alternateVideo": {
        "URL": "https://storage.googleapis.com/now-in-android/NIA049.mp4",
        "startTimestamp": 136,
        "endTimestamp": 193
      }
    },
    {
      "episode": 49,
      "title": "Using the CameraX Exposure Compensation API",
      "content": "This blog post by Wenhung Teng talks about how to use the CameraX Exposure Compensation that makes it much simpler to quickly take images with exceptional quality.",
      "URL": "https://medium.com/androiddevelopers/using-camerax-exposure-compensation-api-11fd75785bf",
      "authorName": "Wenhung Teng",
      "publishDate": "2021-10-12T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Camera"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Compose for Wear OS in Developer preview ⌚",
      "content": "We’re bringing the best of Compose to Wear OS as well, with built-in support for Material You to help you create beautiful apps with less code. Read the following article to review the main composables for Wear OS we’ve built and point you towards resources to get started using them.",
      "URL": "https://android-developers.googleblog.com/2021/10/compose-for-wear-os-now-in-developer.html",
      "authorName": "Jeremy Walker",
      "publishDate": "2021-10-11T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Wear",
        "Compose"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Paging 📑  How to fetch data and bind the PagingData to the UI",
      "content": "The series on Paging continues on with more content! In the second episode, TJ shows how to fetch data and bind the PagingData to the UI, including headers and footers.",
      "URL": "https://www.youtube.com/watch?v=C0H54K63Lww",
      "authorName": "TJ Dahunsi",
      "publishDate": "2021-10-10T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Paging"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Room adds support for Kotlin Symbol Processing",
      "content": "Yigit Boyar wrote the story about how Room added support for Kotlin Symbol Processing (KSP). Spoiler: it wasn’t easy, but it was definitely worth it.",
      "URL": "https://medium.com/androiddevelopers/room-kotlin-symbol-processing-24808528a28e",
      "authorName": "Yigit Boyar",
      "publishDate": "2021-10-09T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Data Storage",
        "Room"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Apply special effects to images with the CameraX Extensions API",
      "content": "Have you ever wanted to apply special effects such as HDR or Night mode when taking pictures from your app? CameraX is here to help you! In this article by Charcoal Chen, learn how to do that using the new ExtensionsManager available in the camera-extensions Jetpack library. ",
      "URL": "https://medium.com/androiddevelopers/apply-special-effects-to-images-with-the-camerax-extensions-api-d1a169b803d3",
      "authorName": "Charcoal Chen",
      "publishDate": "2021-10-06T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Camera"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 49,
      "title": "Wear OS Jetpack libraries now in stable",
      "content": "The Wear OS Jetpack libraries are now in stable.",
      "URL": "https://android-developers.googleblog.com/2021/09/wear-os-jetpack-libraries-now-in-stable.html",
      "authorName": "Jeremy Walker",
      "publishDate": "2021-09-14T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Jetpack",
        "Wear"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 48,
      "title": "Android Dev Summit returns on October 27-28, 2021! 📆",
      "content": "Join us October 27–28 for Android Dev Summit 2021! The show kicks off at 10 AM PST on October 27 with The Android Show: a technical keynote where you’ll hear all the latest developer news and updates. From there, we have over 30 sessions on a range of technical Android development topics, and we’ll be answering your #AskAndroid questions live.",
      "URL": "https://developer.android.com/dev-summit",
      "authorName": "",
      "publishDate": "2021-10-05T23:00:00.000Z",
      "type": "Event 📆",
      "topics": [
        "Events"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 48,
      "title": "Android 12 is live in AOSP! 🤖",
      "content": "We released Android 12 and pushed it to the Android Open Source Project (AOSP). It will be coming to devices later on this year. Thank you for your feedback during the beta.\nAndroid 12 introduces a new design language called Material You along with redesigned widgets, notification UI updates, stretch overscroll, and app launch splash screens. We reduced the CPU time used by core system services, added performance class device capabilities, made ML accelerator drivers updatable outside of platform releases, and prevented apps from launching foreground services from the background and using notification trampolines to improve performance. The new Privacy Dashboard, approximate location, microphone and camera indicators/toggles, and nearby device permissions give users more insight into and control over privacy. We improved the user experience with a unified API for rich content insertion, compatible media transcoding, easier blurs and effects, AVIF image support, enhanced haptics, new camera effects/capabilities, improved native crash debugging, support for rounded screen corners, Play as you download, and Game Mode APIs.",
      "URL": "https://android-developers.googleblog.com/2021/10/android-12-is-live-in-aosp.html",
      "authorName": "Dave Burke",
      "publishDate": "2021-10-03T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Android releases"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 48,
      "title": "Improved Google Play Console user management 🧑‍💼",
      "content": "The user and permission tools in Play Console have a new, decluttered interface and new team management features, making it easier to make sure every team member has the right set of permissions to fulfill their responsibilities without overexposing unrelated business data.\nWe’ve rewritten permission names and descriptions, clarified differentiation between account and app-level permissions, added new search, filtering, and batch-editing capabilities, and added the ability to export this information to a CSV file. In addition, Play Console users can request access to actions with a justification, and we’ve introduced permission groups to make it easier to assign multiple permissions at once to users that share the same or similar roles.",
      "URL": "https://android-developers.googleblog.com/2021/09/improved-google-play-console-user.html",
      "authorName": "Mike Yerou",
      "publishDate": "2021-09-20T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Play"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 48,
      "title": "Making Permissions auto-reset available to billions more devices 🔐",
      "content": "Android 11 introduced permission auto-reset, automatically resetting an app’s runtime permissions when it isn’t used for a few months. In December 2021, we are starting to roll this feature out to devices with Google Play services running Android 6.0 (API level 23) or higher for apps targeting Android 11 (API level 30) or higher. Users can manually enable permission auto-reset for apps targeting API levels 23 to 29.\nSome apps and permissions are automatically exempted from revocation, like active Device Administrator apps used by enterprises, and permissions fixed by enterprise policy. If your app is expected to work primarily in the background without user interaction, you can ask the user to prevent the system from resetting your app’s permissions.",
      "URL": "https://android-developers.googleblog.com/2021/09/making-permissions-auto-reset-available.html",
      "authorName": "Peter Visontay",
      "publishDate": "2021-09-16T23:00:00.000Z",
      "type": "DAC - Android version features",
      "topics": [
        "Permissions"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "Hilt under the hood",
      "content": "This episode dives into how the Hilt annotation processors generate code, and how the Hilt Gradle plugin works behind the scenes to improve the overall experience when using Hilt with Gradle.",
      "URL": "https://medium.com/androiddevelopers/mad-skills-series-hilt-under-the-hood-9d89ee227059",
      "authorName": "Brad Corso",
      "publishDate": "2021-09-07T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Hilt",
        "MAD Skills"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "Hilt extensions",
      "content": "This episode explains how to write your own Hilt Extensions. Hilt Extensions allow you to extend Hilt support to new libraries. Extensions can be created for common patterns in projects, to support non-standard member injection, mirroring bindings, and more.",
      "URL": "https://medium.com/androiddevelopers/hilt-extensions-in-the-mad-skills-series-f2ed6fcba5fe",
      "authorName": "Daniel Santiago",
      "publishDate": "2021-09-12T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Hilt",
        "MAD Skills"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "Migrating from Dagger to Hilt",
      "content": "While you will eventually want to migrate all your existing Dagger modules over to Hilt’s built in components, you can start by migrating application-wide components to Hilt’s singleton component. This episode explains how.",
      "URL": "https://www.youtube.com/watch?v=Xt1_3Nq4lD0&t=15s",
      "authorName": "Marcelo Hernandez",
      "publishDate": "2021-09-19T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Hilt",
        "MAD Skills"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "Trackr comes to the Big Screen",
      "content": "A blog post on Trackr, a sample task management app where we showcase Modern Android Development best practices. This post takes you through how applying Material Design and responsive patterns produced a more refined and intuitive user experience on large screen devices.",
      "URL": "https://medium.com/androiddevelopers/trackr-comes-to-the-big-screen-9f13c6f927bf",
      "authorName": "Jonathan Koren",
      "publishDate": "2021-09-06T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Large Screen",
        "MAD Skills",
        "Material Design"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "Accessibility services and the Android Accessibility model",
      "content": "This Accessibilities series episode covers accessibility services like TalkBack, Switch Access and Voice Access and how they help users interact with your apps. Android’s accessibility framework allows you to write one app and the framework takes care of providing the information needed by different accessibility services.",
      "URL": "https://youtu.be/LxKat_m7mHk",
      "authorName": "Shailen Tuli",
      "publishDate": "2021-09-02T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Accessibility"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "Labeling images for Accessibility",
      "content": "This Accessibilities series episode covers labeling images for accessibility, such as content descriptions for ImageViews and ImageButtons.",
      "URL": "https://youtu.be/O2DeSITnzFk",
      "authorName": "Caren Chang",
      "publishDate": "2021-09-09T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Accessibility"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "New Accessibility Pathway",
      "content": "Want even more accessibility? You are in luck, check out this entire new learning pathway aimed at teaching you how to make your app more accessible.",
      "URL": "https://developer.android.com/courses/pathways/make-your-android-app-accessible",
      "authorName": "",
      "publishDate": "2021-08-31T23:00:00.000Z",
      "type": "",
      "topics": [
        "Accessibility"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "AndroidX Activity Library 1.4.0-alpha01 released",
      "content": "The AndroidX ComponentActivity now implements the MenuHost interface which allows any component to add menu items to the ActionBar by adding a MenuProvider instance to the activity.",
      "URL": "https://developer.android.com/jetpack/androidx/releases/activity#1.4.0-alpha01",
      "authorName": "",
      "publishDate": "2021-08-31T23:00:00.000Z",
      "type": "API change",
      "topics": [
        "AndroidX"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "ADB Podcast Episode 174: Compose in Android Studio",
      "content": "In this episode, Tor and Nick are joined by Chris Sinco, Diego Perez and Nicolas Roard to discuss the features added to Android Studio for Jetpack Compose. Tune in as they discuss the Compose preview, interactive preview, animation inspector, and additions to the Layout inspector along with their approach to creating tooling to support Compose’s code-centric system.",
      "URL": "",
      "authorName": "Tor Norbye",
      "publishDate": "2021-09-08T23:00:00.000Z",
      "type": "Podcast 🎙",
      "topics": [
        "Android Studio",
        "Compose"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 47,
      "title": "ADB Podcast Episode 175: Creating delightful user experiences with Lottie animations",
      "content": "In this episode, Chet, Romain and Tor have a chat with Gabriel Peal from Tonal, well known for his contributions to the Android community on projects such as Mavericks and Lottie. They talked about Lottie and how it helps designers and developers deliver more delightful user experiences by taking complex animations designed in specialized authoring tools such as After Effects, and rendering them efficiently on mobile devices. They also explored the challenges of designing and implementing a rendering engine such as Lottie.",
      "URL": "",
      "authorName": "Chet Haase",
      "publishDate": "2021-09-13T23:00:00.000Z",
      "type": "Podcast 🎙",
      "topics": [
        "Animations"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 45,
      "title": "DataStore released into stable",
      "content": "Datastore was released, providing a data storage solution that allows you to store key-value pairs or typed objects with protocol buffers.",
      "URL": "https://developer.android.com/jetpack/androidx/releases/datastore#1.0.0",
      "authorName": "",
      "publishDate": "2021-08-03T23:00:00.000Z",
      "type": "Jetpack release 🚀",
      "topics": [
        "Data storage",
        "DataStore"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 44,
      "title": "Jetpack Compose 1.0 stable is released",
      "content": "Jetpack Compose, Android’s modern, native UI toolkit is now stable and ready for you to adopt in production. It interoperates with your existing app, integrates with existing Jetpack libraries, implements Material Design with straightforward theming, supports lists with Lazy components using minimal boilerplate, and has a powerful, extensible animation system.",
      "URL": "https://android-developers.googleblog.com/2021/07/jetpack-compose-announcement.html",
      "authorName": "Anna-Chiara Bellini",
      "publishDate": "2021-07-27T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Compose"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 44,
      "title": "Android Studio Artic Fox stable is released",
      "content": "Android Studio Arctic Fox is now available in the stable release channel. Arctic Fox brings Jetpack Compose to life with Compose Preview, Deploy Preview, Compose support in the Layout Inspector, and Live Editing of literals. Compose Preview works with the @Preview annotation to let you instantly see the impact of changes across multiple themes, screen sizes, font sizes, and more. Deploy Preview deploys snippets of your Compose code to a device or emulator for quick testing. Layout inspector now works with apps written fully in Compose as well as apps that have Compose alongside Views, allowing you to explore your layouts and troubleshoot. With Live Edit of literals, you can edit literals such as strings, numbers, booleans, etc. and see the immediate results change in previews, the emulator, or on a physical device — all without having to compile.\n",
      "URL": "https://android-developers.googleblog.com/2021/07/android-studio-arctic-fox-202031-stable.html",
      "authorName": "Amanda Alexander",
      "publishDate": "2021-07-27T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Android Studio",
        "Compose"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 44,
      "title": "User control, privacy, security, and safety",
      "content": "Play announced new updates to bolster user control, privacy, and security. The post covered advertising ID updates, including zeroing out the advertising ID when users opt out of interest-based advertising or ads personalization, the developer preview of the app set ID, enhanced protection for kids, and policy updates around dormant accounts and users of the AccessibilityService API.",
      "URL": "https://android-developers.googleblog.com/2021/07/announcing-policy-updates-to-bolster.html",
      "authorName": "Krish Vitaldevara",
      "publishDate": "2021-07-27T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Play Console"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 44,
      "title": "Identify performance bottlenecks using system trace",
      "content": "System trace profiling within Android Studio with a detailed walkthrough of app startup performance.",
      "URL": "https://www.youtube.com/watch?v=aUrqx9AnDUg",
      "authorName": "Carmen Jackson",
      "publishDate": "2021-07-25T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "MAD Skills",
        "Performance"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 44,
      "title": "Testing in Compose",
      "content": "ADB released episode #171, part of our continuing series on Jetpack Compose. In this episode, Nick and Romain are joined by Filip Pavlis, Jelle Fresen & Jose Alcérreca to talk about Testing in Compose. They discuss how Compose’s testing APIs were developed hand-in-hand with the UI toolkit, making them more deterministic and opening up new possibilities like manipulating time. They go on to discuss the semantics tree, interop testing, screenshot testing and the possibilities for host-side testing.",
      "URL": "https://adbackstage.libsyn.com/episode-171-compose-testing",
      "authorName": "Android Developers Backstage",
      "publishDate": "2021-08-31T23:00:00.000Z",
      "type": "Podcast 🎙",
      "topics": [
        "Compose",
        "Testing"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 42,
      "title": "DataStore reached release candidate status",
      "content": "Jetpack Compose and DataStore have now reached release candidate status meaning the 1.0 stable releases are right around the corner!",
      "URL": "https://developer.android.com/topic/libraries/architecture/datastore",
      "authorName": "",
      "publishDate": "2021-06-29T23:00:00.000Z",
      "type": "Jetpack release 🚀",
      "topics": [
        ""
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 42,
      "title": "Scope Storage Myths",
      "content": "Apps will be required to update their targetSdkVersion to API 30 in the second half of the year. That means your app will be required to work with Scoped Storage. In this blog post, Nicole Borrelli busts some Scope storage myths in a Q&A format.",
      "URL": "https://medium.com/androiddevelopers/scope-storage-myths-ca6a97d7ff37",
      "authorName": "Nicole Borrelli",
      "publishDate": "2021-06-27T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Data storage",
        "Scoped Storage"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Android 12 Beta 2 Update",
      "content": "The second Beta of Android 12 has just been released for you to try. Beta 2 adds new privacy features like the Privacy Dashboard and continues our work of refining the release.",
      "URL": "https://android-developers.googleblog.com/2021/06/android-12-beta-2-update.html",
      "authorName": "Dave Burke",
      "publishDate": "2021-06-08T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Android releases"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Grow Your Indie Game with Help From Google Play",
      "content": "Google Play is opening submissions for two of our annual developer programs - the Indie Games Accelerator and the Indie Games Festival. These programs are designed to help small games studios grow on Google Play, no matter what stage they are in",
      "URL": "https://developers.googleblog.com/2021/06/grow-your-indie-game-with-help-from-google-play.html",
      "authorName": "Patricia Correa",
      "publishDate": "2021-05-31T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Play",
        "Games"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Navigation with Multiple back stacks",
      "content": "As part of the rercommended Material pattern for bottom-navigation, the Jetpack Navigation librar y makes it easy to implement navigation with multiple back-stacks",
      "URL": "https://medium.com/androiddevelopers/navigation-multiple-back-stacks-6c67ba41952f",
      "authorName": "Murat Yener",
      "publishDate": "2021-06-14T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Navigation",
        "MAD Skills"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Navigation in Feature Modules",
      "content": "Feature modules delivered with Play Feature delivery at not downloadedd at install time, but only when the app requestss them. Learn how to use the dynamic features navigation library to include the graph from the feature module.",
      "URL": "https://medium.com/androiddevelopers/navigation-in-feature-modules-322ac3d79334",
      "authorName": "Murat Yener",
      "publishDate": "2021-06-01T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Navigation",
        "MAD Skills"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Android @ Google I/O: 3 things to know in Modern Android Development",
      "content": "This year’s Google I/O brought lots of updates for Modern Android Development. Learn about the top 3 things you should know.",
      "URL": "https://android-developers.googleblog.com/2021/05/mad-spotlight.html",
      "authorName": "The Modern Android Development Team",
      "publishDate": "2021-05-24T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Android releases",
        "MAD Skills"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Top 3 things in Android 12  | Android @ Google I/O '21",
      "content": "Did you miss the latest in Android 12 at Google I/O 2021? Android Software Engineer Chet Haase will recap the top three themes in Android 12 from this year’s Google I/O!",
      "URL": "https://www.youtube.com/watch?v=tvf1wmD5H0M",
      "authorName": "Chet Haase",
      "publishDate": "2021-06-08T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Android Releases"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Building across devices | Android @ Google I/O '21",
      "content": "Did you miss the latest in Building across screens at Google I/O 2021? Product Manager Diana Wong will recap the top three announcements from this year’s Google I/O!",
      "URL": "https://www.youtube.com/watch?v=O5oRiIUk_F4",
      "authorName": "Diana Wong",
      "publishDate": "2021-06-02T23:00:00.000Z",
      "type": "Video 📺",
      "topics": [
        "Form Factors"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Multiple Back Stacks",
      "content": "A deep dive into multiple back stacks and some of the work it took to make this feature happen in Fragments and Navigation",
      "URL": "https://medium.com/androiddevelopers/multiple-back-stacks-b714d974f134",
      "authorName": "Ian Lake",
      "publishDate": "2021-06-06T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Navigation",
        "Fragments"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Build sophisticated search features with AppSearch",
      "content": "AppSearch is an on-device search library which provides high performance and feature-rich full-text search functionality. Learn how to use the new Jetpack AppSearch library for doing high-performance on-device full text searches.",
      "URL": "https://android-developers.googleblog.com/2021/06/sophisticated-search-with-appsearch-in-jetpack.html",
      "authorName": "Dan Saadati",
      "publishDate": "2021-06-13T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "AppSearch"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Untrusted Touch Events in Android",
      "content": "Android 12 prevents touch events from being deliverred if these touches first pass through a window from a different app to ensure users can see what they are interacting with. Learn about alternatives, to see if your app will be affected and how you can test to see if your app will be impacted.",
      "URL": "https://medium.com/androiddevelopers/untrusted-touch-events-2c0e0b9c374c",
      "authorName": "Meghan Mehta",
      "publishDate": "2021-05-25T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Android releases"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "Create an application CorouotineScope using Hilt",
      "content": "Learn how to create an applicatioon-scoped CoroutineScope using Hilt, and how to inject it as a dependency.",
      "URL": "https://medium.com/androiddevelopers/create-an-application-coroutinescope-using-hilt-dd444e721528",
      "authorName": "Manuel Vivo",
      "publishDate": "2021-06-09T23:00:00.000Z",
      "type": "Article 📚",
      "topics": [
        "Coroutines",
        "Hilt"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "ADB Podcast Episode 165: Material Witnesses",
      "content": "In this episode, Chet and Romain chattedd with Hunter and Nick from the Material Design team about recent additions and improvements to the Material Design Component libraries: transitions, motion theming, Compose, large screens support and guidance, etc.",
      "URL": "http://adbackstage.libsyn.com/episode-165-material-witnesses",
      "authorName": "Chet Haase",
      "publishDate": "2021-06-01T23:00:00.000Z",
      "type": "Podcast 🎙",
      "topics": [
        "Material Design"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "ADB Podcast Episode 166: Security Deposit",
      "content": "In this episode, Chad and Jeff from the Android Security team join Tor and Romain to talk about… security. They explain what the platform does to help preserve user trust and device integrity, why it sometimes means restricting existing APIs, and touch on what apps can do or should worry about.",
      "URL": "http://adbackstage.libsyn.com/episode-166-security-deposit",
      "authorName": "Tor Norbye",
      "publishDate": "2021-06-07T23:00:00.000Z",
      "type": "Podcast 🎙",
      "topics": [
        "Security"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    },
    {
      "episode": 41,
      "title": "ADB Podcast Episode 167: Jetpack Compose Layout",
      "content": "In this second episode of our mini-series on Jetpack Compose (AD/BC), Nick and Romain are joined by Anastasia Soboleva, George Mount and Mihai Popa to talk about Compose’s layout system. They explain how the Compose layout model works and its benefits, introduce common layout composables, discuss how writing your own layout is far simpler than Views, and how you can even animate layout.",
      "URL": "https://adbackstage.libsyn.com/episode-167-jetpack-compose-layout",
      "authorName": "Nick Butcher",
      "publishDate": "2021-06-13T23:00:00.000Z",
      "type": "Podcast 🎙",
      "topics": [
        "Compose"
      ],
      "alternateVideo": {
        "URL": "",
        "startTimestamp": 0,
        "endTimestamp": 0
      }
    }
  ]
}
""".trimIndent()
}
