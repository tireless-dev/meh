// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RuleDraft: ImageVector
  get() {
    val current = _ruleDraft
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.RuleDraft",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m29.7 19.3 -3 -3 a1 1 0 0 0 -1.4 0 L16 25.58 V30 h4.41 l9.3 -9.3 a1 1 0 0 0 0 -1.4 M19.6 28 H18 v-1.59 l5 -5 L24.59 23Z M26 21.59 24.41 20 26 18.41 27.59 20Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.7 19.3
          moveTo(x = 29.7f, y = 19.3f)
          // l -3 -3
          lineToRelative(dx = -3.0f, dy = -3.0f)
          // a 1 1 0 0 0 -1.4 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.4f,
            dy1 = 0.0f,
          )
          // L 16 25.58
          lineTo(x = 16.0f, y = 25.58f)
          // V 30
          verticalLineTo(y = 30.0f)
          // h 4.41
          horizontalLineToRelative(dx = 4.41f)
          // l 9.3 -9.3
          lineToRelative(dx = 9.3f, dy = -9.3f)
          // a 1 1 0 0 0 0 -1.4
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.4f,
          )
          // M 19.6 28
          moveTo(x = 19.6f, y = 28.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
          // v -1.59
          verticalLineToRelative(dy = -1.59f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // L 24.59 23z
          lineTo(x = 24.59f, y = 23.0f)
          close()
          // M 26 21.59
          moveTo(x = 26.0f, y = 21.59f)
          // L 24.41 20
          lineTo(x = 24.41f, y = 20.0f)
          // L 26 18.41
          lineTo(x = 26.0f, y = 18.41f)
          // L 27.59 20z
          lineTo(x = 27.59f, y = 20.0f)
          close()
        }
        // <rect width="10" height="2" x="8.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 16
          moveTo(x = 8.0f, y = 16.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="12" height="2" x="8.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // M26 4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v13 a11 11 0 0 0 5.82 9.7 L13 29.48 V27.2 l-4.23 -2.26 A9 9 0 0 1 4 17 V4 h20 v9 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
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
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // a 11 11 0 0 0 5.82 9.7
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.82f,
            dy1 = 9.7f,
          )
          // L 13 29.48
          lineTo(x = 13.0f, y = 29.48f)
          // V 27.2
          verticalLineTo(y = 27.2f)
          // l -4.23 -2.26
          lineToRelative(dx = -4.23f, dy = -2.26f)
          // A 9 9 0 0 1 4 17
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 17.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // h 20
          horizontalLineToRelative(dx = 20.0f)
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _ruleDraft = it }
  }

@Suppress("ObjectPropertyName")
private var _ruleDraft: ImageVector? = null
