// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TagGroup: ImageVector
  get() {
    val current = _tagGroup
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TagGroup",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="10.0" cy="14.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 10 14
          moveTo(x = 10.0f, y = 14.0f)
          // m -2 0
          moveToRelative(dx = -2.0f, dy = 0.0f)
          // a 2 2 0 1 1 4 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          // a 2 2 0 1 1 -4 0z
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // M16 30 a1 1 0 0 1 -.71 -.29 L4.59 19 A2 2 0 0 1 4 17.59 V10 a2 2 0 0 1 2 -2 h7.59 A2 2 0 0 1 15 8.59 l10.71 10.7 a1 1 0 0 1 0 1.42 l-9 9 A1 1 0 0 1 16 30 M6 10 v7.59 l10 10 L23.59 20 l-10 -10Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // a 1 1 0 0 1 -0.71 -0.29
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.71f,
            dy1 = -0.29f,
          )
          // L 4.59 19
          lineTo(x = 4.59f, y = 19.0f)
          // A 2 2 0 0 1 4 17.59
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 17.59f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 7.59
          horizontalLineToRelative(dx = 7.59f)
          // A 2 2 0 0 1 15 8.59
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 8.59f,
          )
          // l 10.71 10.7
          lineToRelative(dx = 10.71f, dy = 10.7f)
          // a 1 1 0 0 1 0 1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.42f,
          )
          // l -9 9
          lineToRelative(dx = -9.0f, dy = 9.0f)
          // A 1 1 0 0 1 16 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 30.0f,
          )
          // M 6 10
          moveTo(x = 6.0f, y = 10.0f)
          // v 7.59
          verticalLineToRelative(dy = 7.59f)
          // l 10 10
          lineToRelative(dx = 10.0f, dy = 10.0f)
          // L 23.59 20
          lineTo(x = 23.59f, y = 20.0f)
          // l -10 -10z
          lineToRelative(dx = -10.0f, dy = -10.0f)
          close()
        }
        // M27.71 13.29 17 2.59 A2 2 0 0 0 15.59 2 H8 a2 2 0 0 0 -2 2 v2 h2 V4 h7.59 l10 10 -1.3 1.29 1.42 1.42 2 -2 a1 1 0 0 0 0 -1.42
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.71 13.29
          moveTo(x = 27.71f, y = 13.29f)
          // L 17 2.59
          lineTo(x = 17.0f, y = 2.59f)
          // A 2 2 0 0 0 15.59 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.59f,
            y1 = 2.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 7.59
          horizontalLineToRelative(dx = 7.59f)
          // l 10 10
          lineToRelative(dx = 10.0f, dy = 10.0f)
          // l -1.3 1.29
          lineToRelative(dx = -1.3f, dy = 1.29f)
          // l 1.42 1.42
          lineToRelative(dx = 1.42f, dy = 1.42f)
          // l 2 -2
          lineToRelative(dx = 2.0f, dy = -2.0f)
          // a 1 1 0 0 0 0 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
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
      .also { _tagGroup = it }
  }

@Suppress("ObjectPropertyName")
private var _tagGroup: ImageVector? = null
