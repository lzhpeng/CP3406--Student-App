# StudentApp - Student Time Management Application 
This is an Android native application developed using Android Studio, specifically designed for students to help manage study time, courses, tasks and goals. 
✨ Functional Features 
- **📊 Dashboard**: View the overview of learning and today's tasks
- **📚 Course Management**: Manage course information and learning progress
- **✅ Task Management**: Create and manage learning tasks
- **📅 Calendar View**: View schedules and time management
- **🎯 Goal Management**: Set and track learning goals 
?? Get Started Quickly 
1. Open the project in Android Studio 
1. Start **Android Studio**
2. Select **"Open an existing project"**
3. Navigate to the `StudentApp` folder
4. Click **"OK"**
5. Wait for Gradle to complete the synchronization 
2. Run the application 
1. Connect to an Android device or start the emulator
2. Click the **Run** button (▶️) or press `Shift + F10`
3. The application will be installed and run on your device 
## 🛠️ Technology Stack 
- **Language**: Kotlin - **IDE**: Android Studio
- **System Construction**: Gradle 7.3.3
- **UI Framework**: Android XML Layouts + ViewBinding
- **Architecture**: Activity-Fragment + Navigation Component
- **Minimum API**: 21 (Android 5.0)
- **Target API**: 32 (Android 12) 
## 📱 Application Screenshot 
The application consists of 5 main pages:
- Dashboard - Learning Overview
- Courses - Course Management
- Tasks - Task Management
- Calendar - Time Scheduling
- Goals - Goal Setting 
## 🔧 Project Structure 
```
StudentApp/
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/studentapp/
│       │   ├── MainActivity.kt
│       │   └── ui/
│       │       ├── dashboard/
│       │       ├── courses/
│       │       ├── tasks/
│       │       ├── calendar/
│       │       └── goals/
│       └── res/
│           ├── drawable/ (icons)
│           ├── layout/ (layout files)
│           ├── menu/ (navigation menu)
│           ├── navigation/ (navigation diagram)
│           └── values/ (resource files)
├── build.gradle (project level) ├── settings.gradle
├── gradle.properties
└── gradle/wrapper/
└── gradle-wrapper.properties
```

## 🎯 Next Steps for Development 
This project provides a basic framework, upon which you can add: 
1. **Data Storage**: Use the Room database to store user data
2. **Network Functionality**: Add cloud synchronization feature
3. **Notification System**: Implement task reminder function
4. **Statistical Charts**: Add visualization for learning progress
5. **User Settings**: Personalized configuration options 
## 📝 Important Notes 
- Make sure to use Android Studio 2022.1 or a later version.
- The project uses stable versions of Gradle and Kotlin to ensure compatibility.
- Support devices running Android 5.0 or higher. 
?? Contribution 
Welcome to submit Issues and Pull Requests to improve this project! 
---

**Development Environment**: Android Studio + Kotlin + Gradle
**Minimum Requirements**: Android 5.0 (API 21)
**Recommended Devices**: Android 8.0+ (API 26+)

# StudentApp - 学生时间管理应用

这是一个使用Android Studio开发的Android原生应用，专为学生设计，帮助管理学习时间、课程、任务和目标。

## ✨ 功能特性

- **📊 仪表板**: 查看学习概览和今日任务
- **📚 课程管理**: 管理课程信息和学习进度
- **✅ 任务管理**: 创建和管理学习任务
- **📅 日历视图**: 查看日程安排和时间管理
- **🎯 目标管理**: 设定和跟踪学习目标

## 🚀 快速开始

### 1. 在Android Studio中打开项目

1. 启动 **Android Studio**
2. 选择 **"Open an existing project"**
3. 导航到 `StudentApp` 文件夹
4. 点击 **"OK"**
5. 等待Gradle同步完成

### 2. 运行应用

1. 连接Android设备或启动模拟器
2. 点击 **Run** 按钮 (▶️) 或按 `Shift + F10`
3. 应用将安装并运行在您的设备上

## 🛠️ 技术栈

- **语言**: Kotlin
- **IDE**: Android Studio
- **构建系统**: Gradle 7.3.3
- **UI框架**: Android XML Layouts + ViewBinding
- **架构**: Activity-Fragment + Navigation Component
- **最低API**: 21 (Android 5.0)
- **目标API**: 32 (Android 12)

## 📱 应用截图

应用包含5个主要页面：
- 仪表板 - 学习概览
- 课程 - 课程管理
- 任务 - 任务管理  
- 日历 - 时间安排
- 目标 - 目标设定

## 🔧 项目结构

```
StudentApp/
├── app/
│   ├── build.gradle
│   └── src/main/
│       ├── AndroidManifest.xml
│       ├── java/com/studentapp/
│       │   ├── MainActivity.kt
│       │   └── ui/
│       │       ├── dashboard/
│       │       ├── courses/
│       │       ├── tasks/
│       │       ├── calendar/
│       │       └── goals/
│       └── res/
│           ├── drawable/ (图标)
│           ├── layout/ (布局文件)
│           ├── menu/ (导航菜单)
│           ├── navigation/ (导航图)
│           └── values/ (资源文件)
├── build.gradle (项目级)
├── settings.gradle
├── gradle.properties
└── gradle/wrapper/
    └── gradle-wrapper.properties
```

## 🎯 下一步开发

这个项目提供了基础框架，您可以在此基础上添加：

1. **数据存储**: 使用Room数据库存储用户数据
2. **网络功能**: 添加云端同步功能
3. **通知系统**: 实现任务提醒功能
4. **统计图表**: 添加学习进度可视化
5. **用户设置**: 个性化配置选项

## 📝 注意事项

- 确保使用Android Studio 2022.1或更高版本
- 项目使用稳定的Gradle和Kotlin版本，确保兼容性
- 支持Android 5.0及以上版本设备

## 🤝 贡献

欢迎提交Issue和Pull Request来改进这个项目！

---

**开发环境**: Android Studio + Kotlin + Gradle
**最低要求**: Android 5.0 (API 21)
**推荐设备**: Android 8.0+ (API 26+)
