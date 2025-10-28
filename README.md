# 💬 Emotion Detector from Text (Java)

This project is part of the **MotionCut Internship** task.  
The goal is to build an **Emotion Detector** that can analyze a piece of text and identify the **dominant emotion** expressed — such as *Happy, Sad, Angry, Surprised,* or *Fearful*.

---

## 🚀 Features
- Detects basic emotions from text input  
- Simple and lightweight (no external API required)  
- Works completely offline  
- Easy to extend with new words or emotions  
- Console-based interface (optional GUI can be added)

---

## 🧠 How It Works
This project uses a **lexicon-based approach**:
1. The program contains a list of emotion-related keywords.  
2. It scans the input text for those words.  
3. It counts how many words match each emotion category.  
4. The emotion with the highest count is chosen as the detected emotion.  
5. If no emotion words are found, the result defaults to **Neutral**.

---

## 🧩
