# Reverse-engineered Bounce Tales

## Overview
This is a reverse-engineered Bounce Tales, which supports saving progress, play MIDI and etc. It's **NOT** include any resource files, I don't have rights, all rights reserved to Microsoft Corporation.

### Missing resources
|files|description|
|:-------------:|:------------------:|
|`a`|Resource map|
|`aa.png`, `ab.png`, `ac.png`, `ad.png`, `ae.png`, `af.png`, `ag.png`, `ah.png`, `ai.png`, `aj.png`, `ak.png`, `al.png`, `am.png`, `an.png`, `ao.png`, `ap.png`, `aq.png`, `ar.png`, `as.png`, `at.png`, `au.png`, `av.png`, `ae.png`, `c.png`, `d.png`, `e.png`, `f.png`, `g.png`, `h.png`, `i.png`, `icon.png`, `j.png`, `k.png`, `l.png`, `m.png`, `n.png`, `o.png`, `p.png`, `q.png`, `r.png`, `s.png`, `t.png`, `u.png`, `v.png`, `w.png`, `x.png`, `y.png`, `z.png`,|Textures|
|`aw.mid`, `ax.mid`, `ay.mid`, `az.mid`, `ba.mid`, `bb.mid`, `bc.mid`, `bd.mid`|Audio files|
|`lang.en-US`, `lang.ru-RU`, etc.|Localization files for your language|
|`a`, `b`, `be`, `bf`, `bg`, `bh`, `bi`, `bj`, `bk`, `bl`, `bm`, `bn`, `bo`, `bp`, `bq`, `br`, `bs`, `bt`, `bu`, `bv`|Undefined files (levels?)|
|`META-INF/MANIFEST.MF`|Manifest file, will be overpal by generated manifest|

### Requirements
- Java Development Kit 17
- ~256 MB free RAM

## Build
At first you should copy the resource files to `src/main/resources` folder. Then after input of these commands Bounce Tales will be builded at `build/libs` directory.

Windows:
```
gradlew.bat build
```
Linux:
```
./gradlew build
```
## License
Copyright 2022 Kirill Lomakin. The source code is licensed under the Apache License, Version 2.0. See [LICENSE](LICENSE) for the full license text. All rights of Bounce Tales reserved to Microsoft Corporation. Notice: this software include a [Hangar Emulator](https://github.com/Lisowolf/HangarEmulator) part.
