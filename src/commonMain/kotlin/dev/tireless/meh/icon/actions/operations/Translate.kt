// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Translate: ImageVector
  get() {
    val current = _translate
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Translate",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.85 29 H30 l-6 -15 h-2.35 l-6 15 h2.15 l1.6 -4 h6.85Z m-7.65 -6 2.62 -6.56 L25.45 23Z M18 7 V5 h-7 V2 H9 v3 H2 v2 h10.74 a15 15 0 0 1 -3.19 6.18 A14 14 0 0 1 7.26 9 h-2.1 a17 17 0 0 0 3 5.58 A17 17 0 0 1 3 18 l.75 1.86 A19 19 0 0 0 9.53 16 a17 17 0 0 0 5.76 3.84 L16 18 a14.5 14.5 0 0 1 -5.12 -3.37 A17.6 17.6 0 0 0 14.8 7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.85 29
          moveTo(x = 27.85f, y = 29.0f)
          // H 30
          horizontalLineTo(x = 30.0f)
          // l -6 -15
          lineToRelative(dx = -6.0f, dy = -15.0f)
          // h -2.35
          horizontalLineToRelative(dx = -2.35f)
          // l -6 15
          lineToRelative(dx = -6.0f, dy = 15.0f)
          // h 2.15
          horizontalLineToRelative(dx = 2.15f)
          // l 1.6 -4
          lineToRelative(dx = 1.6f, dy = -4.0f)
          // h 6.85z
          horizontalLineToRelative(dx = 6.85f)
          close()
          // m -7.65 -6
          moveToRelative(dx = -7.65f, dy = -6.0f)
          // l 2.62 -6.56
          lineToRelative(dx = 2.62f, dy = -6.56f)
          // L 25.45 23z
          lineTo(x = 25.45f, y = 23.0f)
          close()
          // M 18 7
          moveTo(x = 18.0f, y = 7.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // h -7
          horizontalLineToRelative(dx = -7.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10.74
          horizontalLineToRelative(dx = 10.74f)
          // a 15 15 0 0 1 -3.19 6.18
          arcToRelative(
            a = 15.0f,
            b = 15.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.19f,
            dy1 = 6.18f,
          )
          // A 14 14 0 0 1 7.26 9
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 7.26f,
            y1 = 9.0f,
          )
          // h -2.1
          horizontalLineToRelative(dx = -2.1f)
          // a 17 17 0 0 0 3 5.58
          arcToRelative(
            a = 17.0f,
            b = 17.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = 5.58f,
          )
          // A 17 17 0 0 1 3 18
          arcTo(
            horizontalEllipseRadius = 17.0f,
            verticalEllipseRadius = 17.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.0f,
            y1 = 18.0f,
          )
          // l 0.75 1.86
          lineToRelative(dx = 0.75f, dy = 1.86f)
          // A 19 19 0 0 0 9.53 16
          arcTo(
            horizontalEllipseRadius = 19.0f,
            verticalEllipseRadius = 19.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.53f,
            y1 = 16.0f,
          )
          // a 17 17 0 0 0 5.76 3.84
          arcToRelative(
            a = 17.0f,
            b = 17.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.76f,
            dy1 = 3.84f,
          )
          // L 16 18
          lineTo(x = 16.0f, y = 18.0f)
          // a 14.5 14.5 0 0 1 -5.12 -3.37
          arcToRelative(
            a = 14.5f,
            b = 14.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.12f,
            dy1 = -3.37f,
          )
          // A 17.6 17.6 0 0 0 14.8 7z
          arcTo(
            horizontalEllipseRadius = 17.6f,
            verticalEllipseRadius = 17.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 14.8f,
            y1 = 7.0f,
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
      .also { _translate = it }
  }

@Suppress("ObjectPropertyName")
private var _translate: ImageVector? = null
