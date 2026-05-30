// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CommunicationUnified: ImageVector
  get() {
    val current = _communicationUnified
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CommunicationUnified",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 17 H18 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h4 v-2 h-4 v-6 h10 v6 h-2.54 l-2.59 3.9 1.67 1.1 2 -3 H28 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 M8.67 24.1 l.86 -.85 a.8 .8 0 0 1 .9 -.19 l1.05 .42 A.8 .8 0 0 1 12 24.26 v1.9 A.83 .83 0 0 1 11.12 27 c-7.35 -.46 -8.84 -6.69 -9.11 -9.07 A.83 .83 0 0 1 2.83 17 h1.88 a.8 .8 0 0 1 .77 .52 l.42 1.05 a.8 .8 0 0 1 -.18 .9 l-.86 .86 a4.5 4.5 0 0 0 3.8 3.78
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 17
          moveTo(x = 28.0f, y = 17.0f)
          // H 18
          horizontalLineTo(x = 18.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -2.54
          horizontalLineToRelative(dx = -2.54f)
          // l -2.59 3.9
          lineToRelative(dx = -2.59f, dy = 3.9f)
          // l 1.67 1.1
          lineToRelative(dx = 1.67f, dy = 1.1f)
          // l 2 -3
          lineToRelative(dx = 2.0f, dy = -3.0f)
          // H 28
          horizontalLineTo(x = 28.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // M 8.67 24.1
          moveTo(x = 8.67f, y = 24.1f)
          // l 0.86 -0.85
          lineToRelative(dx = 0.86f, dy = -0.85f)
          // a 0.8 0.8 0 0 1 0.9 -0.19
          arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.9f,
            dy1 = -0.19f,
          )
          // l 1.05 0.42
          lineToRelative(dx = 1.05f, dy = 0.42f)
          // A 0.8 0.8 0 0 1 12 24.26
          arcTo(
            horizontalEllipseRadius = 0.8f,
            verticalEllipseRadius = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 24.26f,
          )
          // v 1.9
          verticalLineToRelative(dy = 1.9f)
          // A 0.83 0.83 0 0 1 11.12 27
          arcTo(
            horizontalEllipseRadius = 0.83f,
            verticalEllipseRadius = 0.83f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.12f,
            y1 = 27.0f,
          )
          // c -7.35 -0.46 -8.84 -6.69 -9.11 -9.07
          curveToRelative(
            dx1 = -7.35f,
            dy1 = -0.46f,
            dx2 = -8.84f,
            dy2 = -6.69f,
            dx3 = -9.11f,
            dy3 = -9.07f,
          )
          // A 0.83 0.83 0 0 1 2.83 17
          arcTo(
            horizontalEllipseRadius = 0.83f,
            verticalEllipseRadius = 0.83f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.83f,
            y1 = 17.0f,
          )
          // h 1.88
          horizontalLineToRelative(dx = 1.88f)
          // a 0.8 0.8 0 0 1 0.77 0.52
          arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.77f,
            dy1 = 0.52f,
          )
          // l 0.42 1.05
          lineToRelative(dx = 0.42f, dy = 1.05f)
          // a 0.8 0.8 0 0 1 -0.18 0.9
          arcToRelative(
            a = 0.8f,
            b = 0.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.18f,
            dy1 = 0.9f,
          )
          // l -0.86 0.86
          lineToRelative(dx = -0.86f, dy = 0.86f)
          // a 4.5 4.5 0 0 0 3.8 3.78
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.8f,
            dy1 = 3.78f,
          )
        }
        // <rect width="7" height="2" x="21.0" y="9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 9
          moveTo(x = 21.0f, y = 9.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -7z
          horizontalLineToRelative(dx = -7.0f)
          close()
        }
        // <rect width="9" height="2" x="21.0" y="5.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 5
          moveTo(x = 21.0f, y = 5.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -9z
          horizontalLineToRelative(dx = -9.0f)
          close()
        }
        // m17 6 -3 2.2 V6 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V9.8 l3 2.2Z M4 12 V6 h8 v6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 6
          moveTo(x = 17.0f, y = 6.0f)
          // l -3 2.2
          lineToRelative(dx = -3.0f, dy = 2.2f)
          // V 6
          verticalLineTo(y = 6.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // V 9.8
          verticalLineTo(y = 9.8f)
          // l 3 2.2z
          lineToRelative(dx = 3.0f, dy = 2.2f)
          close()
          // M 4 12
          moveTo(x = 4.0f, y = 12.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
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
      .also { _communicationUnified = it }
  }

@Suppress("ObjectPropertyName")
private var _communicationUnified: ImageVector? = null
