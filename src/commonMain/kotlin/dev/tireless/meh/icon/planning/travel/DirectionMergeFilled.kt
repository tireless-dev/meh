// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectionMergeFilled: ImageVector
  get() {
    val current = _directionMergeFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectionMergeFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 2 H4 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M17.88 15.46 l2.66 2.66 A5 5 0 0 1 22 21.66 V26 h-2 v-4.34 a3 3 0 0 0 -.88 -2.12 l-2.66 -2.66 A5 5 0 0 1 16 16.3 a5 5 0 0 1 -.46 .57 l-2.66 2.66 A3 3 0 0 0 12 21.66 V26 h-2 v-4.34 a5 5 0 0 1 1.46 -3.54 l2.66 -2.66 A3 3 0 0 0 15 13.34 V8.83 l-4.59 4.58 L9 12 l7 -7 7 7 -1.41 1.41 L17 8.83 v4.51 a3 3 0 0 0 .88 2.12
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 2
          moveTo(x = 28.0f, y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
          // M 17.88 15.46
          moveTo(x = 17.88f, y = 15.46f)
          // l 2.66 2.66
          lineToRelative(dx = 2.66f, dy = 2.66f)
          // A 5 5 0 0 1 22 21.66
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 21.66f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4.34
          verticalLineToRelative(dy = -4.34f)
          // a 3 3 0 0 0 -0.88 -2.12
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.88f,
            dy1 = -2.12f,
          )
          // l -2.66 -2.66
          lineToRelative(dx = -2.66f, dy = -2.66f)
          // A 5 5 0 0 1 16 16.3
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 16.3f,
          )
          // a 5 5 0 0 1 -0.46 0.57
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.46f,
            dy1 = 0.57f,
          )
          // l -2.66 2.66
          lineToRelative(dx = -2.66f, dy = 2.66f)
          // A 3 3 0 0 0 12 21.66
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 21.66f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4.34
          verticalLineToRelative(dy = -4.34f)
          // a 5 5 0 0 1 1.46 -3.54
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.46f,
            dy1 = -3.54f,
          )
          // l 2.66 -2.66
          lineToRelative(dx = 2.66f, dy = -2.66f)
          // A 3 3 0 0 0 15 13.34
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 13.34f,
          )
          // V 8.83
          verticalLineTo(y = 8.83f)
          // l -4.59 4.58
          lineToRelative(dx = -4.59f, dy = 4.58f)
          // L 9 12
          lineTo(x = 9.0f, y = 12.0f)
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 17 8.83
          lineTo(x = 17.0f, y = 8.83f)
          // v 4.51
          verticalLineToRelative(dy = 4.51f)
          // a 3 3 0 0 0 0.88 2.12
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.88f,
            dy1 = 2.12f,
          )
        }
        // m17.88 15.46 2.66 2.66 A5 5 0 0 1 22 21.66 V26 h-2 v-4.34 a3 3 0 0 0 -.88 -2.12 l-2.66 -2.66 A5 5 0 0 1 16 16.3 a5 5 0 0 1 -.46 .57 l-2.66 2.66 A3 3 0 0 0 12 21.66 V26 h-2 v-4.34 a5 5 0 0 1 1.46 -3.54 l2.66 -2.66 A3 3 0 0 0 15 13.34 V8.83 l-4.59 4.58 L9 12 l7 -7 7 7 -1.41 1.41 L17 8.83 v4.51 a3 3 0 0 0 .88 2.12
        path {
          // M 17.88 15.46
          moveTo(x = 17.88f, y = 15.46f)
          // l 2.66 2.66
          lineToRelative(dx = 2.66f, dy = 2.66f)
          // A 5 5 0 0 1 22 21.66
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 21.66f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4.34
          verticalLineToRelative(dy = -4.34f)
          // a 3 3 0 0 0 -0.88 -2.12
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.88f,
            dy1 = -2.12f,
          )
          // l -2.66 -2.66
          lineToRelative(dx = -2.66f, dy = -2.66f)
          // A 5 5 0 0 1 16 16.3
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 16.3f,
          )
          // a 5 5 0 0 1 -0.46 0.57
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.46f,
            dy1 = 0.57f,
          )
          // l -2.66 2.66
          lineToRelative(dx = -2.66f, dy = 2.66f)
          // A 3 3 0 0 0 12 21.66
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 12.0f,
            y1 = 21.66f,
          )
          // V 26
          verticalLineTo(y = 26.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -4.34
          verticalLineToRelative(dy = -4.34f)
          // a 5 5 0 0 1 1.46 -3.54
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.46f,
            dy1 = -3.54f,
          )
          // l 2.66 -2.66
          lineToRelative(dx = 2.66f, dy = -2.66f)
          // A 3 3 0 0 0 15 13.34
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 13.34f,
          )
          // V 8.83
          verticalLineTo(y = 8.83f)
          // l -4.59 4.58
          lineToRelative(dx = -4.59f, dy = 4.58f)
          // L 9 12
          lineTo(x = 9.0f, y = 12.0f)
          // l 7 -7
          lineToRelative(dx = 7.0f, dy = -7.0f)
          // l 7 7
          lineToRelative(dx = 7.0f, dy = 7.0f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // L 17 8.83
          lineTo(x = 17.0f, y = 8.83f)
          // v 4.51
          verticalLineToRelative(dy = 4.51f)
          // a 3 3 0 0 0 0.88 2.12
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.88f,
            dy1 = 2.12f,
          )
        }
        // <rect width="32" height="32" fill="#000" />
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
      .also { _directionMergeFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _directionMergeFilled: ImageVector? = null
