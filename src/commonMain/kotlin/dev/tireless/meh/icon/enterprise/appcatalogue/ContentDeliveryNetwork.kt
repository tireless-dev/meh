// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContentDeliveryNetwork: ImageVector
  get() {
    val current = _contentDeliveryNetwork
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ContentDeliveryNetwork",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <circle cx="21.0" cy="21.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 21
          moveTo(x = 21.0f, y = 21.0f)
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
        // <circle cx="7.0" cy="7.0" radius="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 7
          moveTo(x = 7.0f, y = 7.0f)
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
        // M27 31 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4 m0 -6 a2 2 0 1 0 2 2 2 2 0 0 0 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 31
          moveTo(x = 27.0f, y = 31.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
          // m 0 -6
          moveToRelative(dx = 0.0f, dy = -6.0f)
          // a 2 2 0 1 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
        }
        // M30 16 A14.04 14.04 0 0 0 16 2 a13 13 0 0 0 -6.8 1.8 l1.1 1.7 a24 24 0 0 1 2.4 -1 A25 25 0 0 0 10 15 H4 a11 11 0 0 1 1.4 -4.7 L3.9 9 A14 14 0 0 0 2 16 a14 14 0 0 0 14 14 13 13 0 0 0 5.2 -1 l-.6 -1.9 a11.4 11.4 0 0 1 -5.2 .9 A21 21 0 0 1 12 17 h17.9 a3 3 0 0 0 .1 -1 M12.8 27.6 a13 13 0 0 1 -5.3 -3.1 A12.5 12.5 0 0 1 4 17 h6 a25 25 0 0 0 2.8 10.6 M12 15 a21.5 21.5 0 0 1 3.3 -11 h1.4 A21.5 21.5 0 0 1 20 15Z m10 0 a23 23 0 0 0 -2.8 -10.6 A12.1 12.1 0 0 1 27.9 15Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 16
          moveTo(x = 30.0f, y = 16.0f)
          // A 14.04 14.04 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.04f,
            verticalEllipseRadius = 14.04f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // a 13 13 0 0 0 -6.8 1.8
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.8f,
            dy1 = 1.8f,
          )
          // l 1.1 1.7
          lineToRelative(dx = 1.1f, dy = 1.7f)
          // a 24 24 0 0 1 2.4 -1
          arcToRelative(
            a = 24.0f,
            b = 24.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.4f,
            dy1 = -1.0f,
          )
          // A 25 25 0 0 0 10 15
          arcTo(
            horizontalEllipseRadius = 25.0f,
            verticalEllipseRadius = 25.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.0f,
            y1 = 15.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 11 11 0 0 1 1.4 -4.7
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.4f,
            dy1 = -4.7f,
          )
          // L 3.9 9
          lineTo(x = 3.9f, y = 9.0f)
          // A 14 14 0 0 0 2 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // a 14 14 0 0 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // a 13 13 0 0 0 5.2 -1
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.2f,
            dy1 = -1.0f,
          )
          // l -0.6 -1.9
          lineToRelative(dx = -0.6f, dy = -1.9f)
          // a 11.4 11.4 0 0 1 -5.2 0.9
          arcToRelative(
            a = 11.4f,
            b = 11.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.2f,
            dy1 = 0.9f,
          )
          // A 21 21 0 0 1 12 17
          arcTo(
            horizontalEllipseRadius = 21.0f,
            verticalEllipseRadius = 21.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 12.0f,
            y1 = 17.0f,
          )
          // h 17.9
          horizontalLineToRelative(dx = 17.9f)
          // a 3 3 0 0 0 0.1 -1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.1f,
            dy1 = -1.0f,
          )
          // M 12.8 27.6
          moveTo(x = 12.8f, y = 27.6f)
          // a 13 13 0 0 1 -5.3 -3.1
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.3f,
            dy1 = -3.1f,
          )
          // A 12.5 12.5 0 0 1 4 17
          arcTo(
            horizontalEllipseRadius = 12.5f,
            verticalEllipseRadius = 12.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 17.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // a 25 25 0 0 0 2.8 10.6
          arcToRelative(
            a = 25.0f,
            b = 25.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.8f,
            dy1 = 10.6f,
          )
          // M 12 15
          moveTo(x = 12.0f, y = 15.0f)
          // a 21.5 21.5 0 0 1 3.3 -11
          arcToRelative(
            a = 21.5f,
            b = 21.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.3f,
            dy1 = -11.0f,
          )
          // h 1.4
          horizontalLineToRelative(dx = 1.4f)
          // A 21.5 21.5 0 0 1 20 15z
          arcTo(
            horizontalEllipseRadius = 21.5f,
            verticalEllipseRadius = 21.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.0f,
            y1 = 15.0f,
          )
          close()
          // m 10 0
          moveToRelative(dx = 10.0f, dy = 0.0f)
          // a 23 23 0 0 0 -2.8 -10.6
          arcToRelative(
            a = 23.0f,
            b = 23.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.8f,
            dy1 = -10.6f,
          )
          // A 12.1 12.1 0 0 1 27.9 15z
          arcTo(
            horizontalEllipseRadius = 12.1f,
            verticalEllipseRadius = 12.1f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          x1 = 27.9f,
          y1 = 15.0f,
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
      .also { _contentDeliveryNetwork = it }
  }

@Suppress("ObjectPropertyName")
private var _contentDeliveryNetwork: ImageVector? = null
