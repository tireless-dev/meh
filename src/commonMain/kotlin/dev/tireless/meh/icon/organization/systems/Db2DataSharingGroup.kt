// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Db2DataSharingGroup: ImageVector
  get() {
    val current = _db2DataSharingGroup
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Db2DataSharingGroup",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M8 28 v-6.17 l2.59 2.58 L12 23 l-5 -5 -5 5 1.41 1.41 L6 21.83 V28 a2 2 0 0 0 2 2 h9 v-2z m17 -11 c-2.85 0 -5 1.29 -5 3 v7 c0 1.71 2.15 3 5 3 s5 -1.29 5 -3 v-7 c0 -1.71 -2.15 -3 -5 -3 m0 2 c1.94 0 3 .75 3 1 s-1.06 1 -3 1 -3 -.75 -3 -1 1.06 -1 3 -1 m0 9 c-1.94 0 -3 -.75 -3 -1 v-4.58 q1.26 .56 3 .58 c1.74 .02 2.17 -.22 3 -.58 V27 c0 .25 -1.06 1 -3 1 m3.59 -20.41 L26 10.17 V4 a2 2 0 0 0 -2 -2 h-9 v2 h9 v6.17 l-2.59 -2.58 L20 9 l5 5 5 -5z M7 15 c2.85 0 5 -1.29 5 -3 V5 c0 -1.71 -2.15 -3 -5 -3 S2 3.29 2 5 v7 c0 1.71 2.15 3 5 3 M7 4 c1.94 0 3 .75 3 1 S8.94 6 7 6 4 5.25 4 5 s1.06 -1 3 -1 M4 7.42 Q5.26 7.98 7 8 c1.74 .02 2.17 -.22 3 -.58 V12 c0 .25 -1.06 1 -3 1 s-3 -.75 -3 -1z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 28
          moveTo(x = 8.0f, y = 28.0f)
          // v -6.17
          verticalLineToRelative(dy = -6.17f)
          // l 2.59 2.58
          lineToRelative(dx = 2.59f, dy = 2.58f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // L 6 21.83
          lineTo(x = 6.0f, y = 21.83f)
          // V 28
          verticalLineTo(y = 28.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m 17 -11
          moveToRelative(dx = 17.0f, dy = -11.0f)
          // c -2.85 0 -5 1.29 -5 3
          curveToRelative(
            dx1 = -2.85f,
            dy1 = 0.0f,
            dx2 = -5.0f,
            dy2 = 1.29f,
            dx3 = -5.0f,
            dy3 = 3.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // c 0 1.71 2.15 3 5 3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.71f,
            dx2 = 2.15f,
            dy2 = 3.0f,
            dx3 = 5.0f,
            dy3 = 3.0f,
          )
          // s 5 -1.29 5 -3
          reflectiveCurveToRelative(
            dx1 = 5.0f,
            dy1 = -1.29f,
            dx2 = 5.0f,
            dy2 = -3.0f,
          )
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // c 0 -1.71 -2.15 -3 -5 -3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.71f,
            dx2 = -2.15f,
            dy2 = -3.0f,
            dx3 = -5.0f,
            dy3 = -3.0f,
          )
          // m 0 2
          moveToRelative(dx = 0.0f, dy = 2.0f)
          // c 1.94 0 3 0.75 3 1
          curveToRelative(
            dx1 = 1.94f,
            dy1 = 0.0f,
            dx2 = 3.0f,
            dy2 = 0.75f,
            dx3 = 3.0f,
            dy3 = 1.0f,
          )
          // s -1.06 1 -3 1
          reflectiveCurveToRelative(
            dx1 = -1.06f,
            dy1 = 1.0f,
            dx2 = -3.0f,
            dy2 = 1.0f,
          )
          // s -3 -0.75 -3 -1
          reflectiveCurveToRelative(
            dx1 = -3.0f,
            dy1 = -0.75f,
            dx2 = -3.0f,
            dy2 = -1.0f,
          )
          // s 1.06 -1 3 -1
          reflectiveCurveToRelative(
            dx1 = 1.06f,
            dy1 = -1.0f,
            dx2 = 3.0f,
            dy2 = -1.0f,
          )
          // m 0 9
          moveToRelative(dx = 0.0f, dy = 9.0f)
          // c -1.94 0 -3 -0.75 -3 -1
          curveToRelative(
            dx1 = -1.94f,
            dy1 = 0.0f,
            dx2 = -3.0f,
            dy2 = -0.75f,
            dx3 = -3.0f,
            dy3 = -1.0f,
          )
          // v -4.58
          verticalLineToRelative(dy = -4.58f)
          // q 1.26 0.56 3 0.58
          quadToRelative(
            dx1 = 1.26f,
            dy1 = 0.56f,
            dx2 = 3.0f,
            dy2 = 0.58f,
          )
          // c 1.74 0.02 2.17 -0.22 3 -0.58
          curveToRelative(
            dx1 = 1.74f,
            dy1 = 0.02f,
            dx2 = 2.17f,
            dy2 = -0.22f,
            dx3 = 3.0f,
            dy3 = -0.58f,
          )
          // V 27
          verticalLineTo(y = 27.0f)
          // c 0 0.25 -1.06 1 -3 1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.25f,
            dx2 = -1.06f,
            dy2 = 1.0f,
            dx3 = -3.0f,
            dy3 = 1.0f,
          )
          // m 3.59 -20.41
          moveToRelative(dx = 3.59f, dy = -20.41f)
          // L 26 10.17
          lineTo(x = 26.0f, y = 10.17f)
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // h -9
          horizontalLineToRelative(dx = -9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 6.17
          verticalLineToRelative(dy = 6.17f)
          // l -2.59 -2.58
          lineToRelative(dx = -2.59f, dy = -2.58f)
          // L 20 9
          lineTo(x = 20.0f, y = 9.0f)
          // l 5 5
          lineToRelative(dx = 5.0f, dy = 5.0f)
          // l 5 -5z
          lineToRelative(dx = 5.0f, dy = -5.0f)
          close()
          // M 7 15
          moveTo(x = 7.0f, y = 15.0f)
          // c 2.85 0 5 -1.29 5 -3
          curveToRelative(
            dx1 = 2.85f,
            dy1 = 0.0f,
            dx2 = 5.0f,
            dy2 = -1.29f,
            dx3 = 5.0f,
            dy3 = -3.0f,
          )
          // V 5
          verticalLineTo(y = 5.0f)
          // c 0 -1.71 -2.15 -3 -5 -3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -1.71f,
            dx2 = -2.15f,
            dy2 = -3.0f,
            dx3 = -5.0f,
            dy3 = -3.0f,
          )
          // S 2 3.29 2 5
          reflectiveCurveTo(
            x1 = 2.0f,
            y1 = 3.29f,
            x2 = 2.0f,
            y2 = 5.0f,
          )
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // c 0 1.71 2.15 3 5 3
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 1.71f,
            dx2 = 2.15f,
            dy2 = 3.0f,
            dx3 = 5.0f,
            dy3 = 3.0f,
          )
          // M 7 4
          moveTo(x = 7.0f, y = 4.0f)
          // c 1.94 0 3 0.75 3 1
          curveToRelative(
            dx1 = 1.94f,
            dy1 = 0.0f,
            dx2 = 3.0f,
            dy2 = 0.75f,
            dx3 = 3.0f,
            dy3 = 1.0f,
          )
          // S 8.94 6 7 6
          reflectiveCurveTo(
            x1 = 8.94f,
            y1 = 6.0f,
            x2 = 7.0f,
            y2 = 6.0f,
          )
          // S 4 5.25 4 5
          reflectiveCurveTo(
            x1 = 4.0f,
            y1 = 5.25f,
            x2 = 4.0f,
            y2 = 5.0f,
          )
          // s 1.06 -1 3 -1
          reflectiveCurveToRelative(
            dx1 = 1.06f,
            dy1 = -1.0f,
            dx2 = 3.0f,
            dy2 = -1.0f,
          )
          // M 4 7.42
          moveTo(x = 4.0f, y = 7.42f)
          // Q 5.26 7.98 7 8
          quadTo(
            x1 = 5.26f,
            y1 = 7.98f,
            x2 = 7.0f,
            y2 = 8.0f,
          )
          // c 1.74 0.02 2.17 -0.22 3 -0.58
          curveToRelative(
            dx1 = 1.74f,
            dy1 = 0.02f,
            dx2 = 2.17f,
            dy2 = -0.22f,
            dx3 = 3.0f,
            dy3 = -0.58f,
          )
          // V 12
          verticalLineTo(y = 12.0f)
          // c 0 0.25 -1.06 1 -3 1
          curveToRelative(
            dx1 = 0.0f,
            dy1 = 0.25f,
            dx2 = -1.06f,
            dy2 = 1.0f,
            dx3 = -3.0f,
            dy3 = 1.0f,
          )
          // s -3 -0.75 -3 -1z
          reflectiveCurveToRelative(
            dx1 = -3.0f,
            dy1 = -0.75f,
            dx2 = -3.0f,
            dy2 = -1.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
          horizontalLineToRelative(dx = -32.0f)
          close()
        }
      }.build()
      .also { _db2DataSharingGroup = it }
  }

@Suppress("ObjectPropertyName")
private var _db2DataSharingGroup: ImageVector? = null
