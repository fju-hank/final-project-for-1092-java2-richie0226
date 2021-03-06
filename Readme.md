# 程式設計(二) 期末專題
## 毛睿群 409570042 

## 專題概要用途
這次設計的主要功能是提供使用者處理停車場繳費事宜，另有設計附加功能來做提升。
停車場計費每個小時收費 30 元，場內有設實名制停車位，每部車主要以車牌為辨識資訊，此外有附加使用者名稱辨識，以防車子遭偷竊，對使用者是多一層保障。
有設計面板可供使用者選取功能，Start按鈕按下後，會進入輸入ID的畫面，輸入時會自動隱藏，保護消費者隱私，在後台可清楚看見輸入的ID，即可辨識身分，除了主功能計費外，也有電子時鐘，可輸入建議改善內容的功能，也可做為緊急通話的替代，目前暫設緊急通話功能，可預防停車場緊急事件的發生，如有遇到不會使用的情形，也可以透過使用說明的按鈕來協助。

## 使用方式及主要功能
Panel是GUI功能選單，點開會出現五種功能，分別是Emergency call、Start、Time、Help、Comment，一開始會列出所有功能表，字體大小及背景和按鈕的顏色都有額外自學去修改，每個功能選項都是可以選擇進入及單獨運行的，最特別的是可以透過觸碰連結到各個功能分頁，從沒想過一個看似平凡的動作要運用這麼多的程式碼來執行，花了最多自學在這個部分，每個功能都可以正常運行，最特別的附加功能應該就是電子時鐘Time了，是所有功能中花費最多時間自學的，單獨運行比較能運作完整，不過是確實能穩定執行且準確的電子時鐘，日期方面也是準確且會每天更改的。Start按鈕按下後，會進入輸入ID的畫面，輸入時會自動隱藏，保護消費者隱私，在後台可清楚看見輸入的ID，即可辨識身分。Comment功能主要使用JTextField，可以輸入希望改善的地方，不管是按Enter鍵，還是按設計的Submit按鈕都可以寄出，後台也可以看見。Help功能主要是JLabel的應用，真的去了解才發現JLabel無法直接換行，於是製作了四段，也更熟悉應用。
設計了Tester要單獨運行，主要功能是提供使用者處理停車場繳費事宜，研究了很久能不能連結到Panel，最後還是只能單獨運行，不過運作方面也是正常的，透過Class Car的合併使用，可以準確的紀錄使用者車牌ID、進出場時間和計算應繳交金額，也運用到了繼承的應用來提升，場內有設實名制停車位，每部車主要以車牌ID為辨識資訊，此外有附加使用者名稱辨識，以防車子遭偷竊，對使用者是多一層保障，進入後會看到歡迎的標語，是使用讀寫檔案的應用來實踐，接著往下滑就會顯示主要功能及所有資訊。
設計了Parking可單獨運行，結合網際網路的應用，可協助尋找市區停車場的詳細資訊，包括營業時間、計費方式、汽機車總車位及剩餘車位、所在位置、GPS定位等，必需在有網路的環境下使用，使用起來方便且快速。
設計了Counter可單獨運行，可協助後期紀錄及尋找使用者姓名，記錄消費者使用頻率及方便後期市場分析，另外有設計計數的遊戲，是使用執行緒的功能來實踐，運行完成會顯示耗時多少毫秒。
設計了Input可單獨運行，是一個選單可供辨識使用者資訊是否正確，後台可以協助預防。
## 學習收穫
這學期的收穫十分豐富，有感覺到學習是有收穫的。
從分析教授的程式碼開始，明白整體的思路，認真分析，在學習的過程中一定要動手寫程式碼，
很多東西和體會必須自己動手才能真正屬於自己，實踐是最重要的。
而且還可以從測試中，體會到程式設計的樂趣，感受到自己做好一個程式，然後執行出結果，會非常有成就感!
## 實際應用
此次專題使用到的額外功能有:
執行緒、繼承、輸出入、讀寫檔案、GUI視窗介面、網路連線
